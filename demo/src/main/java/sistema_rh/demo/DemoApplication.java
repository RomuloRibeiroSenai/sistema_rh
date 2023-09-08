package sistema_rh.demo;

import java.util.ArrayList;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import classes.Atendente;
import classes.Funcionario;
import classes.Gerente;
import classes.Supervisor;
import enums.Unidade_Federal;
import menus.Menu_Inicial;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		int escolha;
		ArrayList<Funcionario> lista_Funcionarios = new ArrayList<>();
		Gerente baiano = new Gerente("Albert", "9874563", "N", 10000, Unidade_Federal.BA);
		Supervisor carioca = new Supervisor("Zelda", "121511", "115522", 5000, Unidade_Federal.RJ);
		Atendente paulista = new Atendente("Beto", "1511515", "554411", 1500, Unidade_Federal.SP);
		lista_Funcionarios.add(baiano);
		lista_Funcionarios.add(paulista);
		lista_Funcionarios.add(carioca);
		Menu_Inicial menu = new Menu_Inicial();
		escolha = menu.greet();
		switch(escolha){
			case 1:
				menu.add_func(lista_Funcionarios);
				break;
			case 2:
				String pessoa = menu.ver_nome(lista_Funcionarios);
				for (int i = 0; i < lista_Funcionarios.size(); i ++){
					if(pessoa.equalsIgnoreCase(lista_Funcionarios.get(i).getNome())){
						double valor = lista_Funcionarios.get(i).getSalario();
						System.out.println("O salário é R$"+ valor);
						// eu posso ter um break aqui pra nao rodar o loop todo ?
					}
				}
				break;
			case 3:
				String pessoa1 = menu.ver_nome(lista_Funcionarios);
				String cargo = menu.achar_cargo(lista_Funcionarios, pessoa1);
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
				String pessoa2 = menu.ver_nome(lista_Funcionarios);
				String cargo1 = menu.achar_cargo(lista_Funcionarios, pessoa2);
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
				String pessoa3 = menu.ver_nome(lista_Funcionarios);
				String cargo2 = menu.achar_cargo(lista_Funcionarios, pessoa3);
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
				String pessoa4 = menu.ver_nome(lista_Funcionarios);
				String cargo3 = menu.achar_cargo(lista_Funcionarios, pessoa4);
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
			default:
		}
		
	}

}
