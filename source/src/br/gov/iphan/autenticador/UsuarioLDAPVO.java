package br.gov.iphan.autenticador;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;


@XStreamAlias("br.gov.iphan.siscau.ws.vo.UsuarioLDAPVO")
public class UsuarioLDAPVO {

    @XStreamAlias("nomeUsuario")
    private String nomeUsuario;

    @XStreamAlias("loginUsuario")
    private String loginUsuario;

    @XStreamOmitField
    private String senha;

    @XStreamAlias("emailUsuario")
    private String emailUsuario;

    @XStreamAlias("estadoUsuario")
    private String estadoUsuario;

    @XStreamAlias("cidadeUsuario")
    private String cidadeUsuario;

    
    
    public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getCidadeUsuario() {
		return cidadeUsuario;
	}

	public void setCidadeUsuario(String cidadeUsuario) {
		this.cidadeUsuario = cidadeUsuario;
	}

	public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}