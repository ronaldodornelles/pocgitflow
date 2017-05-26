package br.gov.iphan.siscau.ws.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;


public class UsuarioLDAPVO {
// Teste
    @XStreamAlias("nomeUsuario")
    private String nome;

    @XStreamAlias("loginUsuario")
    private String login;

    @XStreamOmitField
    private String senha;

    @XStreamAlias("emailUsuario")
    private String email;

    @XStreamAlias("estadoUsuario")
    private String estado;

    @XStreamAlias("cidadeUsuario")
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}