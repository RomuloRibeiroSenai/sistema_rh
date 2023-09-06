package classes;

import enums.Unidade_Federal;
import interfaces.Calculo;

public class Supervisor extends Funcionario implements Calculo{
    
    public Supervisor(String nome, String cpf, String cpts, double salario, Unidade_Federal UF){
        super(nome, cpf, cpts, salario, UF);
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
    public double calcular13(double salario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcular13'");
    }

    @Override
    public double calcularFerias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularFerias'");
    }

}
