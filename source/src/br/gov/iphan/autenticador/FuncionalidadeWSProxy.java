/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.ServiceException
 *  javax.xml.rpc.Stub
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.FuncionalidadeWS;
import br.gov.iphan.autenticador.FuncionalidadeWSServiceLocator;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;

public class FuncionalidadeWSProxy
implements FuncionalidadeWS {
    private String _endpoint = null;
    private FuncionalidadeWS funcionalidadeWS = null;

    public FuncionalidadeWSProxy() {
        this._initFuncionalidadeWSProxy();
    }

    public FuncionalidadeWSProxy(String endpoint) {
        this._endpoint = endpoint;
        this._initFuncionalidadeWSProxy();
    }

    private void _initFuncionalidadeWSProxy() {
        try {
            this.funcionalidadeWS = new FuncionalidadeWSServiceLocator().getFuncionalidadeWSPort();
            if (this.funcionalidadeWS != null) {
                if (this._endpoint != null) {
                    ((Stub)this.funcionalidadeWS)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this._endpoint);
                } else {
                    this._endpoint = (String)((Stub)this.funcionalidadeWS)._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }
        }
        catch (ServiceException var1_1) {
            // empty catch block
        }
    }

    public String getEndpoint() {
        return this._endpoint;
    }

    public void setEndpoint(String endpoint) {
        this._endpoint = endpoint;
        if (this.funcionalidadeWS != null) {
            ((Stub)this.funcionalidadeWS)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this._endpoint);
        }
    }

    public FuncionalidadeWS getFuncionalidadeWS() {
        if (this.funcionalidadeWS == null) {
            this._initFuncionalidadeWSProxy();
        }
        return this.funcionalidadeWS;
    }

    @Override
    public String alterarFuncionalidade(Long arg0, String arg1, String arg2, String arg3, Long arg4, Boolean arg5, String arg6) throws RemoteException {
        if (this.funcionalidadeWS == null) {
            this._initFuncionalidadeWSProxy();
        }
        return this.funcionalidadeWS.alterarFuncionalidade(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @Override
    public String authFuncionalidade(String arg0, String arg1, String arg2) throws RemoteException {
        if (this.funcionalidadeWS == null) {
            this._initFuncionalidadeWSProxy();
        }
        return this.funcionalidadeWS.authFuncionalidade(arg0, arg1, arg2);
    }

    @Override
    public String consultarFuncionalidade(String arg0, String arg1, String arg2, Long arg3, Boolean arg4, String arg5) throws RemoteException {
        if (this.funcionalidadeWS == null) {
            this._initFuncionalidadeWSProxy();
        }
        return this.funcionalidadeWS.consultarFuncionalidade(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @Override
    public String listFuncionalidades(String arg0) throws RemoteException {
        if (this.funcionalidadeWS == null) {
            this._initFuncionalidadeWSProxy();
        }
        return this.funcionalidadeWS.listFuncionalidades(arg0);
    }

    @Override
    public String salvarFuncionalidade(String arg0, String arg1, String arg2, Long arg3, Boolean arg4, String arg5) throws RemoteException {
        if (this.funcionalidadeWS == null) {
            this._initFuncionalidadeWSProxy();
        }
        return this.funcionalidadeWS.salvarFuncionalidade(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}

