package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    private static int count = 1;

    private int id;
    private Cliente cliente;
    private Servico servico;
    private Date data;

    public Agendamento(Cliente cliente, Servico servico, Date data) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        this.id = count;
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
        count += 1;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String toString(){
        return "Id do agendamento: " + id +
                "\nNome: " + cliente.getNome() +
                "\nCPF: " + cliente.getCPF() +
                "\n" + servico +
                "\nData de agendamento: " + data;
    }
}
