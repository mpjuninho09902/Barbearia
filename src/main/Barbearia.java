package main;

import models.Agendamento;
import models.Cliente;
import models.Pessoa;
import models.Servico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Barbearia {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Servico> servicos;
    private static ArrayList<Agendamento> agendamentos;
    private static ArrayList<Cliente> clientes;

    public static void main(String[] args) {
        servicos = new ArrayList<>();
        agendamentos = new ArrayList<>();
        clientes = new ArrayList<>();

        menu();
    }

    public static void menu(){
        System.out.println("--------------------------------------------------");
        System.out.println("------------Welcome to the BarberShop-------------");
        System.out.println("--------------------------------------------------");
        System.out.println("*** Selecione uma operacao que deseja realizar ***");
        System.out.println("--------------------------------------------------");
        System.out.println("|    Opcao 1 - Cadastrar Cliente   |");
        System.out.println("|    Opcao 2 - Listar Clientes     |");
        System.out.println("|    Opcao 3 - Cadastrar Servico   |");
        System.out.println("|    Opcao 4 - Listar Servicos     |");
        System.out.println("|    Opcao 5 - Fazer agendamento   |");
        System.out.println("|    Opcao 6 - Listar agendamentos |");
        System.out.println("|    Opcao 7 - Sair                |");

        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                cadastrarCliente();
                break;
            case 2:
                listarClientes();
                break;
            case 3:
                cadastrarServico();
                break;
            case 4:
                listarServicos();
                break;
            case 5:
                fazerAgendamento();
                break;
            case 6:
                listarAgendamentos();
                break;
            case 7:
                System.out.println("Obrigado por utilizar nossa barbearia!");
                System.exit(0);
            default:
                System.out.println("Digite uma opcao valida!");
        }
    }

    public static void cadastrarCliente(){
        System.out.println("Nome: ");
        String nome = input.next();

        System.out.println("Sexo: ");
        char sexo = input.next().charAt(0);

        System.out.println("Telefone: ");
        String telefone = input.next();

        System.out.println("CPF: ");
        String cpf = input.next();

        System.out.println("Email: ");
        String email = input.next();

        input.nextLine();
        System.out.println("Endereco: ");
        String endereco = input.nextLine();

        System.out.println("Cep: ");
        String cep = input.next();

        Cliente cliente = new Cliente(nome, sexo, telefone, cpf, email, endereco, cep);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");

        menu();
    }

    public static void listarClientes(){
        if (clientes.size() > 0){
            System.out.println("Lista de clientes: ");
            for (Cliente c : clientes){
                System.out.println(c + "\n");
            }
        }else {
            System.out.println("Nao ha clientes cadastrados!");
        }

        menu();
    }

    public static void cadastrarServico(){
        System.out.println("Descricao do servico: ");
        String descricao = input.next();

        System.out.println("Valor: ");
        Double valor = input.nextDouble();

        Servico servico = new Servico(descricao, valor);
        servicos.add(servico);
        System.out.println("Servico cadastrado com sucesso!");

        menu();
    }

    public static void listarServicos(){
        if (servicos.size() > 0){
            System.out.println("Lista de servicos: ");
            for (Servico s : servicos){
                System.out.println(s + "\n");
            }
        }else {
            System.out.println("Nao ha servicos cadastrados!");
        }

        menu();
    }

    public static void fazerAgendamento(){
        System.out.println("Nome: ");
        String nome = input.next();
        System.out.println("CPF: ");
        String cpf = input.next();
        Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);

        System.out.println("Descricao: ");
        String descricao = input.next();
        System.out.println("Valor: ");
        Double valor = input.nextDouble();
        Servico servico = new Servico(descricao, valor);
        servicos.add(servico);

        Agendamento agendamento = new Agendamento(cliente, servico, new Date());
        agendamentos.add(agendamento);

        if (agendamentos.size() > 0){
            System.out.println("Agendamento realizado com sucesso!");
        }
        else {
            System.out.println("Nao foi possivel realizar o agendamento, tente novamente!");
        }

        menu();
    }

    public static void listarAgendamentos(){
        if (agendamentos.size() > 0){
            System.out.println("Lista de agendamentos: ");
            for (Agendamento a : agendamentos){
                System.out.println(a + "\n");
            }
        }else {
            System.out.println("Nao ha agendamentos!");
        }

        menu();
    }
}
