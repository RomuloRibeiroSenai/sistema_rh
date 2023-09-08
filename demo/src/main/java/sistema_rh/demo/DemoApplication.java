package sistema_rh.demo;

import java.util.ArrayList;
import java.util.Scanner;

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
		
	}

}
