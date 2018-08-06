package com.example.cimtech.eventosufla;

import java.io.Serializable;

/**
 * Created by Douglas on 12/08/2017.
 */

public class Categoria implements Serializable {

    private int id;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
