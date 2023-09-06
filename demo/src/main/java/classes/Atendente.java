package classes;

import enums.Unidade_Federal;
import interfaces.Calculo;

public class Atendente extends Funcionario implements Calculo{
    
    public Atendente(String nome, String cpf, String cpts, double salario, Unidade_Federal UF){
        super(nome, cpf, cpts, salario, UF);
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcular13'");
    }

    @Override
    public double calcularFerias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularFerias'");
    }

    @Override
    public double calcularINSS() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularINSS'");
    }
}
