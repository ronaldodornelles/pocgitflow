/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.ServiceException
 *  javax.xml.rpc.Stub
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.UsuarioSistemaWS;
import br.gov.iphan.autenticador.UsuarioSistemaWSServiceLocator;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;

public class UsuarioSistemaWSProxy
implements UsuarioSistemaWS {
    private String _endpoint = null;
    private UsuarioSistemaWS usuarioSistemaWS = null;

    public UsuarioSistemaWSProxy() {
        this._initUsuarioSistemaWSProxy();
    }

    public UsuarioSistemaWSProxy(String endpoint) {
        this._endpoint = endpoint;
        this._initUsuarioSistemaWSProxy();
    }

    private void _initUsuarioSistemaWSProxy() {
        try {
            this.usuarioSistemaWS = new UsuarioSistemaWSServiceLocator().getUsuarioSistemaWSPort();
            if (this.usuarioSistemaWS != null) {  
                if (this._endpoint != null) {
                    ((Stub)this.usuarioSistemaWS)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this._endpoint);
                } else {
                    this._endpoint = (String)((Stub)this.usuarioSistemaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
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
        if (this.usuarioSistemaWS != null) {
            ((Stub)this.usuarioSistemaWS)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this._endpoint);
        }
    }

    public UsuarioSistemaWS getUsuarioSistemaWS() {
        if (this.usuarioSistemaWS == null) {
            this._initUsuarioSistemaWSProxy();
        }
        return this.usuarioSistemaWS;
    }

    @Override
    public String autenticaUsuario(String arg0, String arg1, String arg2) throws RemoteException {
        if (this.usuarioSistemaWS == null) {
            this._initUsuarioSistemaWSProxy();
        }
        return this.usuarioSistemaWS.autenticaUsuario(arg0, arg1, arg2);
    }

    @Override
    public String pesquisaDadosUsuario(String arg0) throws RemoteException {
        if (this.usuarioSistemaWS == null) {
            this._initUsuarioSistemaWSProxy();
        }
        return this.usuarioSistemaWS.pesquisaDadosUsuario(arg0);
    }
}

