/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.ServiceException
 *  javax.xml.rpc.Stub
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.PerfilWS;
import br.gov.iphan.autenticador.PerfilWSServiceLocator;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;

public class PerfilWSProxy
implements PerfilWS {
    private String _endpoint = null;
    private PerfilWS perfilWS = null;

    public PerfilWSProxy() {
        this._initPerfilWSProxy();
    }

    public PerfilWSProxy(String endpoint) {
        this._endpoint = endpoint;
        this._initPerfilWSProxy();
    }

    private void _initPerfilWSProxy() {
        try {
            this.perfilWS = new PerfilWSServiceLocator().getPerfilWSPort();
            if (this.perfilWS != null) {
                if (this._endpoint != null) {
                    ((Stub)this.perfilWS)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this._endpoint);
                } else {
                    this._endpoint = (String)((Stub)this.perfilWS)._getProperty("javax.xml.rpc.service.endpoint.address");
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
        if (this.perfilWS != null) {
            ((Stub)this.perfilWS)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this._endpoint);
        }
    }

    public PerfilWS getPerfilWS() {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS;
    }

    @Override
    public String alterarPerfil(Long arg0, String arg1, String arg2, String arg3) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.alterarPerfil(arg0, arg1, arg2, arg3);
    }

    @Override
    public String consultarPerfil(String arg0, String arg1, String arg2) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.consultarPerfil(arg0, arg1, arg2);
    }

    @Override
    public String funcionalidadesPerfil(Long arg0) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.funcionalidadesPerfil(arg0);
    }

    @Override
    public String perfisSistema(String arg0) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.perfisSistema(arg0);
    }

    @Override
    public String perfisUsuario(String arg0, String arg1) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.perfisUsuario(arg0, arg1);
    }

    @Override
    public String salvarPerfil(String arg0, String arg1, String arg2) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.salvarPerfil(arg0, arg1, arg2);
    }

    @Override
    public String vincularFuncionalidade(Long arg0, String[] arg1) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.vincularFuncionalidade(arg0, arg1);
    }

    @Override
    public String vincularPerfil(String arg0, String[] arg1) throws RemoteException {
        if (this.perfilWS == null) {
            this._initPerfilWSProxy();
        }
        return this.perfilWS.vincularPerfil(arg0, arg1);
    }
}

