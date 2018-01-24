package br.com.simed.model;

import java.util.Date;

public class Usuario {
    private int codigoUsuario;
    private String nomeUsuario;
    private Date ultimaData;
    private String login;
    private String senha;
    private int cod_permissao;
    private Byte status;

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getUltimaData() {
        return ultimaData;
    }

    public void setUltimaData(Date ultimaData) {
        this.ultimaData = ultimaData;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCod_permissao() {
        return cod_permissao;
    }

    public void setCod_permissao(int cod_permissao) {
        this.cod_permissao = cod_permissao;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
    

    
}
