package com.packade.models;

import com.packade.models.Endereco;
import com.packade.models.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    public OperadorDeCaixa() {
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalario=" + ValorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
