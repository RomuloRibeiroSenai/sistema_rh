package sistema_rh.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import menus.Menu_Inicial;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Menu_Inicial menu = new Menu_Inicial();
		menu.greet();
	}

}
