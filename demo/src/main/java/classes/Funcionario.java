package classes;

import java.io.Serializable;

import enums.Unidade_Federal;

public abstract class Funcionario extends Pessoa implements Serializable{
    protected String cpts;
    protected double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpts() {
        return cpts;
    }

    public void setCpts(String cpts) {
        this.cpts = cpts;
    }

    public Funcionario (String nome, String cpf, String cpts, double salario, Unidade_Federal UF){
        super(nome, cpf, cpts, UF);
        this.cpts = cpts;
        this.salario = salario;
        this.UF = UF;
    }
}
