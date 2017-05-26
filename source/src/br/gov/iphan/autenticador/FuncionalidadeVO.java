/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  com.thoughtworks.xstream.XStream
 */
package br.gov.iphan.autenticador;

import br.gov.iphan.autenticador.FuncionalidadeWSProxy;
import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Properties;

public class FuncionalidadeVO {
    private Long id;
    private String desSigla;
    private String nomFuncionalidade;
    private String txtDescricao;
    private String idPai;
    private String siglaSistema;
    private String status;
    private String nomeSistema;
    private List<FuncionalidadeVO> catFuncionalidades;
    private boolean isSelected;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesSigla() {
        return this.desSigla;
    }

    public void setDesSigla(String desSigla) {
        this.desSigla = desSigla;
    }

    public String getNomFuncionalidade() {
        return this.nomFuncionalidade;
    }

    public void setNomFuncionalidade(String nomFuncionalidade) {
        this.nomFuncionalidade = nomFuncionalidade;
    }

    public String getTxtDescricao() {
        return this.txtDescricao;
    }

    public void setTxtDescricao(String txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    public String getIdPai() {
        return this.idPai;
    }

    public void setIdPai(String idPai) {
        this.idPai = idPai;
    }

    public String getSiglaSistema() {
        return this.siglaSistema;
    }

    public void setSiglaSistema(String siglaSistema) {
        this.siglaSistema = siglaSistema;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.id == null ? 0 : this.id.hashCode());
        return result;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof FuncionalidadeVO)) {
            return false;
        }
        FuncionalidadeVO other = (FuncionalidadeVO)obj;
        if (this.id == null ? other.id != null : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public List<FuncionalidadeVO> getCatFuncionalidades() throws RemoteException {
        FuncionalidadeWSProxy funcWs = new FuncionalidadeWSProxy();
        XStream retorno = new XStream();
        String result = funcWs.listFuncionalidades(this.getNomeSistema());
        retorno.alias("br.gov.iphan.siscau.ws.vo.FuncionalidadeVO", (Class)FuncionalidadeVO.class);
        retorno.alias("list", (Class)List.class);
        retorno.alias("br.gov.iphan.siscau.ws.vo.FuncionalidadeVO", (Class)FuncionalidadeVO.class);
        retorno.alias("list", (Class)List.class);
        this.catFuncionalidades = (List)retorno.fromXML(result);
        for (FuncionalidadeVO funcVO : this.catFuncionalidades) {
            FuncionalidadeVO funcremove;
            if (funcVO.getIdPai() == null) {
                funcremove = funcVO;
                this.catFuncionalidades.remove(funcremove);
                continue;
            }
            if (funcVO.getIdPai().equals(this.idPai)) continue;
            funcremove = funcVO;
            this.catFuncionalidades.remove(funcremove);
        }
        return this.catFuncionalidades;
    }

    public void setCatFuncionalidades(List<FuncionalidadeVO> catFuncionalidades) {
        this.catFuncionalidades = catFuncionalidades;
    }

    public String getNomeSistema() {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/authenticator.properties"));
            this.nomeSistema = properties.getProperty("sistema");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return this.nomeSistema == null ? "" : this.nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }
}

