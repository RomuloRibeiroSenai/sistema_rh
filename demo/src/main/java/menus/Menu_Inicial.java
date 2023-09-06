package menus;

import java.util.Scanner;

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
}
