/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.FuncionalidadeWS;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface FuncionalidadeWSService
extends Service {
    public String getFuncionalidadeWSPortAddress();

    public FuncionalidadeWS getFuncionalidadeWSPort() throws ServiceException;

    public FuncionalidadeWS getFuncionalidadeWSPort(URL var1) throws ServiceException;
}

