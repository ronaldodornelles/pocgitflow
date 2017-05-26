/*
 * Decompiled with CFR 0_110.
 */
package br.gov.iphan.autenticador;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UsuarioSistemaWS
extends Remote {
    public String autenticaUsuario(String var1, String var2, String var3) throws RemoteException;

    public String pesquisaDadosUsuario(String var1) throws RemoteException;
}

