package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class Pessoa {
    protected static int count = 1;
    protected int id;
    protected String nome;
    protected char sexo;
    protected String telefone;
    protected String CPF;
    protected String email;

    public Pessoa(String nome, char sexo, String telefone, String CPF, String email) {
        this.id = count;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.CPF = CPF;
        this.email = email;
        count += 1;
    }

    public Pessoa(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
