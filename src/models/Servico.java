package models;

import utils.Utils;

import java.util.ArrayList;

public class Servico {
    private static int count = 1;

    private int id;
    private String descricao;
    private Double valor;

    public Servico(String descricao, Double valor) {
        this.id = count;
        this.descricao = descricao;
        this.valor = valor;
        count += 1;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Id do servico: " + id +
                "\nDescricao: " + descricao +
                "\nValor: " + Utils.doubleToString(valor);
    }
}
