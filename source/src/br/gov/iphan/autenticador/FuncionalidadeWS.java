/*
 * Decompiled with CFR 0_110.
 */
package br.gov.iphan.autenticador;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FuncionalidadeWS
extends Remote {
    public String alterarFuncionalidade(Long var1, String var2, String var3, String var4, Long var5, Boolean var6, String var7) throws RemoteException;

    public String authFuncionalidade(String var1, String var2, String var3) throws RemoteException;

    public String consultarFuncionalidade(String var1, String var2, String var3, Long var4, Boolean var5, String var6) throws RemoteException;

    public String listFuncionalidades(String var1) throws RemoteException;

    public String salvarFuncionalidade(String var1, String var2, String var3, Long var4, Boolean var5, String var6) throws RemoteException;
}

