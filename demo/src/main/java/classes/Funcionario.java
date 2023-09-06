package classes;

public abstract class Funcionario {
    protected String nome, cpf, cpts;
    protected double salario;
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

    public Funcionario (String nome, String cpf, String cpts, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cpts = cpts;
        this.salario = salario;
    }
}
