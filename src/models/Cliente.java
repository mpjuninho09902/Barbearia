package models;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Pessoa {
    private String endereco;
    private String cep;

    public Cliente(String nome, char sexo, String telefone, String CPF, String email, String endereco, String cep) {
        super(nome, sexo, telefone, CPF, email);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(String nome, String CPF){
        super(nome, CPF);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String toString(){
        return "Nome: "+ nome +
                "\nSexo: " + sexo +
                "\nTelefone: " + telefone +
                "\nCPF: " + CPF +
                "\nEmail: " + email +
                "\nEndereco: " + endereco +
                "\nCep: " + cep;
    }
}
