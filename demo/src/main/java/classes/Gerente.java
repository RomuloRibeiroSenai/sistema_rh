package classes;

import enums.Unidade_Federal;
import interfaces.Calculo;

public class Gerente extends Funcionario implements Calculo{
    
    public Gerente(String nome, String cpf, String cpts, double salario, Unidade_Federal UF){
        super(nome, cpf, cpts, salario, UF);
    }

    @Override
    public double calcularSalario() {
        System.out.println(this.salario);
        return this.salario;
    }

    @Override
    public double calcularFGTS(double salario) {
        double fgts;
        fgts = salario * 0.08;
        System.out.println("Seu valor mensal de FGTS é R$" + fgts);
        return fgts;
    }

    @Override
    public double calcular13(double salario) {
        
        System.out.println("A primeira parcela vai ser paga no dia 21/06 no valor de R$ " + (salario / 2));
        System.out.println("A segunda parcela vai ser paga no dia 21/12 no valor de R$ " + (salario / 2));
        return salario;
    }

    @Override
    public double calcularFerias(double salario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularFerias'");
    }

    @Override
    public double calcularINSS(double salario) {
        double inss;

        inss = salario * 0.15;
        System.out.println("O valor descontado de INSS é de R$" + inss);
        return inss;
    }
}
