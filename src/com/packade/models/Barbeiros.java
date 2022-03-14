package com.packade.models;

public class Barbeiros extends FuncionarioCLT implements CalculaBonificacao {

    public Barbeiros() {

    }

    public Barbeiros(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "Barbeiros{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalario=" + ValorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        
    }

    public void calculaBonificacao() {
    }
}
