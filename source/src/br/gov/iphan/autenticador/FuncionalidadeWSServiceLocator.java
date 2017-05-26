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

import br.gov.iphan.autenticador.FuncionalidadeWS;
import br.gov.iphan.autenticador.FuncionalidadeWSBindingStub;
import br.gov.iphan.autenticador.FuncionalidadeWSService;
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

public class FuncionalidadeWSServiceLocator
extends org.apache.axis.client.Service
implements FuncionalidadeWSService {
    Properties properties = new Properties();
    private String FuncionalidadeWSPort_address = "";
    private String FuncionalidadeWSPortWSDDServiceName = "FuncionalidadeWSPort";
    private HashSet ports = null;

    public FuncionalidadeWSServiceLocator() {
        this.loadPortAddress();
    }

    public FuncionalidadeWSServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public FuncionalidadeWSServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public void loadPortAddress() {
        try {
            this.properties.load(this.getClass().getResourceAsStream("/authenticator.properties"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.FuncionalidadeWSPort_address = String.valueOf(this.properties.getProperty("addressLDP")) + "/SISCAU/FuncionalidadeWS";
    }

    @Override
    public String getFuncionalidadeWSPortAddress() {
        return this.FuncionalidadeWSPort_address;
    }

    public String getFuncionalidadeWSPortWSDDServiceName() {
        return this.FuncionalidadeWSPortWSDDServiceName;
    }

    public void setFuncionalidadeWSPortWSDDServiceName(String name) {
        this.FuncionalidadeWSPortWSDDServiceName = name;
    }

    @Override
    public FuncionalidadeWS getFuncionalidadeWSPort() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.FuncionalidadeWSPort_address);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getFuncionalidadeWSPort(endpoint);
    }

    @Override
    public FuncionalidadeWS getFuncionalidadeWSPort(URL portAddress) throws ServiceException {
        try {
            FuncionalidadeWSBindingStub _stub = new FuncionalidadeWSBindingStub(portAddress, this);
            _stub.setPortName(this.getFuncionalidadeWSPortWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setFuncionalidadeWSPortEndpointAddress(String address) {
        this.FuncionalidadeWSPort_address = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (FuncionalidadeWS.class.isAssignableFrom(serviceEndpointInterface)) {
                FuncionalidadeWSBindingStub _stub = new FuncionalidadeWSBindingStub(new URL(this.FuncionalidadeWSPort_address), this);
                _stub.setPortName(this.getFuncionalidadeWSPortWSDDServiceName());
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
        if ("FuncionalidadeWSPort".equals(inputPortName)) {
            return this.getFuncionalidadeWSPort();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://ws.siscau.iphan.gov.br/", "FuncionalidadeWSService");
    }

    public Iterator getPorts() {
        if (this.ports == null) {
            this.ports = new HashSet();
            this.ports.add(new QName("http://ws.siscau.iphan.gov.br/", "FuncionalidadeWSPort"));
        }
        return this.ports.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"FuncionalidadeWSPort".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setFuncionalidadeWSPortEndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

