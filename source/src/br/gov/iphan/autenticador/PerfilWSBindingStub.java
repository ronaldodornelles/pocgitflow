/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.Service
 *  org.apache.axis.AxisFault
 *  org.apache.axis.NoEndPointException
 *  org.apache.axis.client.Call
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 *  org.apache.axis.constants.Style
 *  org.apache.axis.constants.Use
 *  org.apache.axis.description.OperationDesc
 *  org.apache.axis.description.ParameterDesc
 *  org.apache.axis.soap.SOAP11Constants
 *  org.apache.axis.soap.SOAPConstants
 *  org.apache.axis.utils.JavaUtils
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.PerfilWS;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;
import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.soap.SOAP11Constants;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;

public class PerfilWSBindingStub
extends Stub
implements PerfilWS {
    private Vector cachedSerClasses = new Vector();
    private Vector cachedSerQNames = new Vector();
    private Vector cachedSerFactories = new Vector();
    private Vector cachedDeserFactories = new Vector();
    static OperationDesc[] _operations = new OperationDesc[8];

    static {
        PerfilWSBindingStub._initOperationDesc1();
    }

    private static void _initOperationDesc1() {
        OperationDesc oper = new OperationDesc();
        oper.setName("alterarPerfil");
        ParameterDesc param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "long"), (Class)Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg1"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg2"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg3"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[0] = oper;
        oper = new OperationDesc();
        oper.setName("consultarPerfil");
        param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg1"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg2"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[1] = oper;
        oper = new OperationDesc();
        oper.setName("funcionalidadesPerfil");
        param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "long"), (Class)Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[2] = oper;
        oper = new OperationDesc();
        oper.setName("perfisSistema");
        param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[3] = oper;
        oper = new OperationDesc();
        oper.setName("perfisUsuario");
        param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg1"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[4] = oper;
        oper = new OperationDesc();
        oper.setName("salvarPerfil");
        param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg1"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg2"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[5] = oper;
        oper = new OperationDesc();
        oper.setName("vincularFuncionalidade");
        param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "long"), (Class)Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg1"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[6] = oper;
        oper = new OperationDesc();
        oper.setName("vincularPerfil");
        param = new ParameterDesc(new QName("", "arg0"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new ParameterDesc(new QName("", "arg1"), (byte) 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), (Class)String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass((Class)String.class);
        oper.setReturnQName(new QName("", "return"));
        oper.setStyle(Style.WRAPPED);
        oper.setUse(Use.LITERAL);
        PerfilWSBindingStub._operations[7] = oper;
    }

    public PerfilWSBindingStub() throws AxisFault {
        this(null);
    }

    public PerfilWSBindingStub(URL endpointURL, Service service) throws AxisFault {
        this(service);
        this.cachedEndpoint = endpointURL;
    }

    public PerfilWSBindingStub(Service service) throws AxisFault {
        this.service = service == null ? new org.apache.axis.client.Service() : service;
        ((org.apache.axis.client.Service)this.service).setTypeMappingVersion("1.2");
    }

    protected Call createCall() throws RemoteException {
        try {
            Call _call = super._createCall();
            if (this.maintainSessionSet) {
                _call.setMaintainSession(this.maintainSession);
            }
            if (this.cachedUsername != null) {
                _call.setUsername(this.cachedUsername);
            }
            if (this.cachedPassword != null) {
                _call.setPassword(this.cachedPassword);
            }
            if (this.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(this.cachedEndpoint);
            }
            if (this.cachedTimeout != null) {
                _call.setTimeout(this.cachedTimeout);
            }
            if (this.cachedPortName != null) {
                _call.setPortName(this.cachedPortName);
            }
            Enumeration keys = this.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String)keys.nextElement();
                _call.setProperty(key, this.cachedProperties.get(key));
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new AxisFault("Failure trying to get the Call object", _t);
        }
    }

    @Override
    public String alterarPerfil(Long arg0, String arg1, String arg2, String arg3) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "alterarPerfil"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0, arg1, arg2, arg3});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }

    @Override
    public String consultarPerfil(String arg0, String arg1, String arg2) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "consultarPerfil"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0, arg1, arg2});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }

    @Override
    public String funcionalidadesPerfil(Long arg0) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "funcionalidadesPerfil"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }

    @Override
    public String perfisSistema(String arg0) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "perfisSistema"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }

    @Override
    public String perfisUsuario(String arg0, String arg1) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "perfisUsuario"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0, arg1});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }

    @Override
    public String salvarPerfil(String arg0, String arg1, String arg2) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "salvarPerfil"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0, arg1, arg2});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }

    @Override
    public String vincularFuncionalidade(Long arg0, String[] arg1) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "vincularFuncionalidade"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0, arg1});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }

    @Override
    public String vincularPerfil(String arg0, String[] arg1) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("http://ws.siscau.iphan.gov.br/", "vincularPerfil"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{arg0, arg1});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (String)_resp;
        }
        catch (Exception _exception) {
            return (String)JavaUtils.convert((Object)_resp, (Class)String.class);
        }
    }
}

