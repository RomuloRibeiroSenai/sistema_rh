package classes;

import enums.Unidade_Federal;

public abstract class Pessoa {
    protected String nome, cpf, dataNasc;
    protected Unidade_Federal UF;

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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Pessoa(String nome, String cpf, String dataNasc, Unidade_Federal UF){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.UF = UF;
    }
}
