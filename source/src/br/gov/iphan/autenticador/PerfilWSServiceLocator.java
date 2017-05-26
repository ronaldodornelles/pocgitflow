/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.PerfilWS;
import br.gov.iphan.autenticador.PerfilWSBindingStub;
import br.gov.iphan.autenticador.PerfilWSService;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Stub;

public class PerfilWSServiceLocator
extends org.apache.axis.client.Service
implements PerfilWSService {
    Properties properties = new Properties();
    private String PerfilWSPort_address = "";
    private String PerfilWSPortWSDDServiceName = "PerfilWSPort";
    private HashSet ports = null;

    public PerfilWSServiceLocator() {
        this.loadPortAddress();
    }

    public PerfilWSServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public PerfilWSServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public void loadPortAddress() {
        try {
            this.properties.load(this.getClass().getResourceAsStream("/authenticator.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.PerfilWSPort_address = String.valueOf(this.properties.getProperty("addressLDP")) + "/SISCAU/PerfilWS";
    }

    @Override
    public String getPerfilWSPortAddress() {
        return this.PerfilWSPort_address;
    }

    public String getPerfilWSPortWSDDServiceName() {
        return this.PerfilWSPortWSDDServiceName;
    }

    public void setPerfilWSPortWSDDServiceName(String name) {
        this.PerfilWSPortWSDDServiceName = name;
    }

    @Override
    public PerfilWS getPerfilWSPort() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.PerfilWSPort_address);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getPerfilWSPort(endpoint);
    }

    @Override
    public PerfilWS getPerfilWSPort(URL portAddress) throws ServiceException {
        try {
            PerfilWSBindingStub _stub = new PerfilWSBindingStub(portAddress, this);
            _stub.setPortName(this.getPerfilWSPortWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setPerfilWSPortEndpointAddress(String address) {
        this.PerfilWSPort_address = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (PerfilWS.class.isAssignableFrom(serviceEndpointInterface)) {
                PerfilWSBindingStub _stub = new PerfilWSBindingStub(new URL(this.PerfilWSPort_address), this);
                _stub.setPortName(this.getPerfilWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return this.getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("PerfilWSPort".equals(inputPortName)) {
            return this.getPerfilWSPort();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://ws.siscau.iphan.gov.br/", "PerfilWSService");
    }

    public Iterator getPorts() {
        if (this.ports == null) {
            this.ports = new HashSet();
            this.ports.add(new QName("http://ws.siscau.iphan.gov.br/", "PerfilWSPort"));
        }
        return this.ports.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"PerfilWSPort".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setPerfilWSPortEndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

