package sistema_rh.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import menus.Menu_Inicial;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		int escolha;
		Menu_Inicial menu = new Menu_Inicial();
		escolha = menu.greet();
		switch(escolha){
			case 1:
				//do
				break;
			case 2:			
				boolean valido = false;
				while (!valido){

				}
		}
	}

}
