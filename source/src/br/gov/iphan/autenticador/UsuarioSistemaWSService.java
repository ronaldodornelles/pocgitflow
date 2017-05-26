/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.UsuarioSistemaWS;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface UsuarioSistemaWSService
extends Service {
    public String getUsuarioSistemaWSPortAddress();

    public UsuarioSistemaWS getUsuarioSistemaWSPort() throws ServiceException;

    public UsuarioSistemaWS getUsuarioSistemaWSPort(URL var1) throws ServiceException;
}

