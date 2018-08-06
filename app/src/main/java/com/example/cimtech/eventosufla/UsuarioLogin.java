package com.example.cimtech.eventosufla;

/**
 * Created by Douglas on 12/08/2017.
 */

public class UsuarioLogin {

    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public UsuarioLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
