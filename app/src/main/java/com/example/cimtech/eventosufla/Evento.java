package com.example.cimtech.eventosufla;

import java.io.Serializable;

/**
 * Created by Douglas on 12/08/2017.
 */

public class Evento implements Serializable {

    private int id;
    private String descricao;
    private int nvagas;
    private int totalInscritos;
    private String data;
    private Categoria categoria;
    private Local local;

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

    public int getNvagas() {
        return nvagas;
    }

    public void setNvagas(int nvagas) {
        this.nvagas = nvagas;
    }

    public int getTotalInscritos() {
        return totalInscritos;
    }

    public void setTotalInscritos(int totalInscritos) {
        this.totalInscritos = totalInscritos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
