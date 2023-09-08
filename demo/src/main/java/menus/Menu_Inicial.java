package menus;

import java.util.ArrayList;
import java.util.Scanner;

import classes.Atendente;
import classes.Funcionario;
import classes.Gerente;
import classes.Supervisor;
import enums.Unidade_Federal;

public class Menu_Inicial {
    Scanner sc = new Scanner(System.in);

    public int greet(){
        int escolha;
        System.out.println("Bem Vindo"+"\n"+"Escolha sua opção");
        System.out.println("1.Inserir Funcionário"+"\n"+"2.Calcular Salario"+
        "\n"+"3.Calcular FGTS"+"\n"+"4.Calcular 13"+ "\n"+"5.Calcular férias"+
        "\n"+ "6.Calcular INSS");
        escolha = sc.nextInt();
        return escolha;
    }
    public ArrayList<Funcionario> add_func(ArrayList<Funcionario> lista_Funcionarios){
        String nome, cpf, cpts, ufa, cargo;
        double salario;
        Unidade_Federal UF;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("CPF: ");
        cpf = sc.nextLine();
        System.out.println("CPTS: ");
        cpts = sc.nextLine();
        System.out.println("Salario: ");
        salario = sc.nextDouble();
        System.out.println("(Sigla)UF:");
        ufa = sc.nextLine().toUpperCase();
        UF = Unidade_Federal.valueOf(ufa);
        System.out.println("Cargo: ");
        cargo = sc.nextLine().toLowerCase();

        switch(cargo){
            case "gerente":
                Gerente pessoa3 = new Gerente(nome, cpf, cpts, salario, UF);
                lista_Funcionarios.add(pessoa3);
                break;
            case "supervisor":
                Supervisor pessoa4 = new Supervisor(nome, cpf, cpts, salario, UF);
                lista_Funcionarios.add(pessoa4);
                break;
            case "atendente":
                Atendente pessoa5 = new Atendente(nome, cpf, cpts, salario, UF);
                lista_Funcionarios.add(pessoa5);
                break;
            default:
                System.out.println("Cargo inválido, Atendente, Gerente ou Supervisor por enquanto");
        }

        return lista_Funcionarios;
    }
    public String ver_nome(ArrayList<Funcionario> lista_Funcionarios){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome ? ");
        String nome = sc.nextLine();
        for (int i = 0; i < lista_Funcionarios.size(); i++){
            if(nome.equalsIgnoreCase(lista_Funcionarios.get(i).getNome())){
                return nome;
            }
        }
        return "Não consta no cadastro";
    }
    public String achar_cargo(ArrayList<Funcionario> lista_Funcionarios, String nome){
        for (int i = 0; i < lista_Funcionarios.size(); i++){
            Funcionario joe = lista_Funcionarios.get(i);

            if (nome.equalsIgnoreCase(joe.getNome())){
                if (joe instanceof Gerente){
                    return "gerente";
                } else if (joe instanceof Supervisor){
                    return "supervisor";
                } else if (joe instanceof Atendente){
                    return "atendente";
                }
            }
        }
        return "not found";
    }
}
