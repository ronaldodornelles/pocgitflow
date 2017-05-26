/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.PerfilWS;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface PerfilWSService
extends Service {
    public String getPerfilWSPortAddress();

    public PerfilWS getPerfilWSPort() throws ServiceException;

    public PerfilWS getPerfilWSPort(URL var1) throws ServiceException;
}

