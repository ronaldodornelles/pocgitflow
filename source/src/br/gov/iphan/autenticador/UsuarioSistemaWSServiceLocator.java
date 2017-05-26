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

import br.gov.iphan.autenticador.UsuarioSistemaWS;
import br.gov.iphan.autenticador.UsuarioSistemaWSBindingStub;
import br.gov.iphan.autenticador.UsuarioSistemaWSService;
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

public class UsuarioSistemaWSServiceLocator
extends org.apache.axis.client.Service
implements UsuarioSistemaWSService {
    Properties properties = new Properties();
    private String UsuarioSistemaWSPort_address = "";
    private String UsuarioSistemaWSPortWSDDServiceName = "UsuarioSistemaWSPort";
    private HashSet ports = null;

    public UsuarioSistemaWSServiceLocator() {
        this.loadPortAddress();
    }

    public void loadPortAddress() {
        try {
            this.properties.load(this.getClass().getResourceAsStream("/authenticator.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.UsuarioSistemaWSPort_address = String.valueOf(this.properties.getProperty("addressLDP"));
    }

    public UsuarioSistemaWSServiceLocator(EngineConfiguration config) {
        super(config);
        this.loadPortAddress();
    }

    public UsuarioSistemaWSServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
        this.loadPortAddress();
    }

    @Override
    public String getUsuarioSistemaWSPortAddress() {
        this.loadPortAddress();
        return this.UsuarioSistemaWSPort_address;
    }

    public String getUsuarioSistemaWSPortWSDDServiceName() {
        return this.UsuarioSistemaWSPortWSDDServiceName;
    }

    public void setUsuarioSistemaWSPortWSDDServiceName(String name) {
        this.UsuarioSistemaWSPortWSDDServiceName = name;
    }

    @Override
    public UsuarioSistemaWS getUsuarioSistemaWSPort() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.UsuarioSistemaWSPort_address);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getUsuarioSistemaWSPort(endpoint);
    }

    @Override
    public UsuarioSistemaWS getUsuarioSistemaWSPort(URL portAddress) throws ServiceException {
        try {
            UsuarioSistemaWSBindingStub _stub = new UsuarioSistemaWSBindingStub(portAddress, this);
            _stub.setPortName(this.getUsuarioSistemaWSPortWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setUsuarioSistemaWSPortEndpointAddress(String address) {
        this.loadPortAddress();
        this.UsuarioSistemaWSPort_address = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (UsuarioSistemaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                UsuarioSistemaWSBindingStub _stub = new UsuarioSistemaWSBindingStub(new URL(this.UsuarioSistemaWSPort_address), this);
                _stub.setPortName(this.getUsuarioSistemaWSPortWSDDServiceName());
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
        if ("UsuarioSistemaWSPort".equals(inputPortName)) {
            return this.getUsuarioSistemaWSPort();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://ws.siscau.iphan.gov.br/", "UsuarioSistemaWSService");
    }

    public Iterator getPorts() {
        if (this.ports == null) {
            this.ports = new HashSet();
            this.ports.add(new QName("http://ws.siscau.iphan.gov.br/", "UsuarioSistemaWSPort"));
        }
        return this.ports.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"UsuarioSistemaWSPort".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setUsuarioSistemaWSPortEndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

