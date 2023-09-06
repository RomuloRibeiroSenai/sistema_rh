package classes;

import interfaces.Calculo;

public class Gerente extends Funcionario implements Calculo{
    
    public Gerente(String nome, String cpf, String cpts, double salario){
        super(nome, cpf, cpts, salario);
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
    }

    @Override
    public double calcularFGTS() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularFGTS'");
    }

    @Override
    public double calcular13() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcular13'");
    }

    @Override
    public double calcularFerias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularFerias'");
    }
}
