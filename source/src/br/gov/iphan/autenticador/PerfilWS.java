/*
 * Decompiled with CFR 0_110.
 */
package br.gov.iphan.autenticador;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PerfilWS
extends Remote {
    public String alterarPerfil(Long var1, String var2, String var3, String var4) throws RemoteException;

    public String consultarPerfil(String var1, String var2, String var3) throws RemoteException;

    public String funcionalidadesPerfil(Long var1) throws RemoteException;

    public String perfisSistema(String var1) throws RemoteException;

    public String perfisUsuario(String var1, String var2) throws RemoteException;

    public String salvarPerfil(String var1, String var2, String var3) throws RemoteException;

    public String vincularFuncionalidade(Long var1, String[] var2) throws RemoteException;

    public String vincularPerfil(String var1, String[] var2) throws RemoteException;
}

