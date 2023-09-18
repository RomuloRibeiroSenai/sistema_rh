package menus;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
        "\n"+ "6.Calcular INSS\n"+"7.Ver Lista de Funcionários");
        escolha = sc.nextInt();
        return escolha;
    }
    public ArrayList<Funcionario> add_func(ArrayList<Funcionario> lista_Funcionarios){
        String nome, cpf, cpts, ufa, cargo = "";
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
        sc.nextLine();
        System.out.println("(Sigla)UF:");
        ufa = sc.nextLine().toUpperCase();
        UF = Unidade_Federal.valueOf(ufa);
        while (!(cargo.equalsIgnoreCase("gerente") || cargo.equalsIgnoreCase("atendente")
         || cargo.equalsIgnoreCase("supervisor"))){
        System.out.println("Atendente, Gerente ou Supervisor por enquanto\nCargo: ");
        cargo = sc.nextLine().toLowerCase();
}
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
                // caso que nunca chega se o while funcionar
        }
        // try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("funcionarios.dat", true))) {
        //     outputStream.writeObject(lista_Funcionarios.get(lista_Funcionarios.size() - 1));
        //     System.out.println("foi");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        
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
    public void ver_lista(ArrayList<Funcionario> lista_Funcionarios){
        String cargo;
        System.out.println(lista_Funcionarios.size());
        for(int i = 0 ; i < lista_Funcionarios.size(); i++){
            cargo = achar_cargo(lista_Funcionarios, lista_Funcionarios.get(i).getNome()).toUpperCase();
            System.out.println(lista_Funcionarios.get(i).getNome()+" "+ cargo);
        }
        
    }

    public void escolha(int escolha, ArrayList<Funcionario> lista_Funcionarios){
        switch(escolha){
			case 1:
				lista_Funcionarios = this.add_func(lista_Funcionarios);
				break;
			case 2:
				String pessoa = this.ver_nome(lista_Funcionarios);
				for (int i = 0; i < lista_Funcionarios.size(); i ++){
					if(pessoa.equalsIgnoreCase(lista_Funcionarios.get(i).getNome())){
						double valor = lista_Funcionarios.get(i).getSalario();
						System.out.println("O salário é R$"+ valor);
						break;
					}
				}
				break;
			case 3:
				String pessoa1 = this.ver_nome(lista_Funcionarios);
				String cargo = this.achar_cargo(lista_Funcionarios, pessoa1);
				for (int i = 0; i < lista_Funcionarios.size(); i ++){
					if(pessoa1.equalsIgnoreCase(lista_Funcionarios.get(i).getNome())){
						if (cargo.equals("gerente")){
							Gerente gerente = (Gerente) lista_Funcionarios.get(i);
							gerente.calcularFGTS(gerente.getSalario());						
						} else if(cargo.equals("supervisor")){
							Supervisor supervisor = (Supervisor) lista_Funcionarios.get(i);
							supervisor.calcularFGTS(supervisor.getSalario());
						} else if (cargo.equals("atendente")){
							Atendente atendente = (Atendente)lista_Funcionarios.get(i);
							atendente.calcularFGTS(atendente.getSalario());
						}
					}
				}			
				break;
			case 4:
				String pessoa2 = this.ver_nome(lista_Funcionarios);
				String cargo1 = this.achar_cargo(lista_Funcionarios, pessoa2);
				for (int i = 0; i < lista_Funcionarios.size(); i ++){
					if(pessoa2.equalsIgnoreCase(lista_Funcionarios.get(i).getNome())){
						if (cargo1.equals("gerente")){
							Gerente gerente = (Gerente) lista_Funcionarios.get(i);
							gerente.calcular13(gerente.getSalario());						
						} else if(cargo1.equals("supervisor")){
							Supervisor supervisor = (Supervisor) lista_Funcionarios.get(i);
							supervisor.calcular13(supervisor.getSalario());
						} else if (cargo1.equals("atendente")){
							Atendente atendente = (Atendente)lista_Funcionarios.get(i);
							atendente.calcular13(atendente.getSalario());
						}
					}
				}			
				break;
			case 5:
				String pessoa3 = this.ver_nome(lista_Funcionarios);
				String cargo2 = this.achar_cargo(lista_Funcionarios, pessoa3);
				for (int i = 0; i < lista_Funcionarios.size(); i ++){
					if(pessoa3.equalsIgnoreCase(lista_Funcionarios.get(i).getNome())){
						if (cargo2.equals("gerente")){
							Gerente gerente = (Gerente) lista_Funcionarios.get(i);
							gerente.calcularFerias(gerente.getSalario());						
						} else if(cargo2.equals("supervisor")){
							Supervisor supervisor = (Supervisor) lista_Funcionarios.get(i);
							supervisor.calcularFerias(supervisor.getSalario());
						} else if (cargo2.equals("atendente")){
							Atendente atendente = (Atendente)lista_Funcionarios.get(i);
							atendente.calcularFerias(atendente.getSalario());
						}
					}
				}			
				break;
			case 6:
				String pessoa4 = this.ver_nome(lista_Funcionarios);
				String cargo3 = this.achar_cargo(lista_Funcionarios, pessoa4);
				for (int i = 0; i < lista_Funcionarios.size(); i ++){
					if(pessoa4.equalsIgnoreCase(lista_Funcionarios.get(i).getNome())){
						if (cargo3.equals("gerente")){
							Gerente gerente = (Gerente) lista_Funcionarios.get(i);
							gerente.calcularINSS(gerente.getSalario());						
						} else if(cargo3.equals("supervisor")){
							Supervisor supervisor = (Supervisor) lista_Funcionarios.get(i);
							supervisor.calcularINSS(supervisor.getSalario());
						} else if (cargo3.equals("atendente")){
							Atendente atendente = (Atendente)lista_Funcionarios.get(i);
							atendente.calcularINSS(atendente.getSalario());
						}
					}
				}			
				break;
			case 7:
				this.ver_lista(lista_Funcionarios);
				break;
		}
    }
}
