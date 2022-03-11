package com.packade.models;

import com.packade.models.CalculaBonificacao;
import com.packade.models.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private double valorDaBonificação;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorDaBonificação = this.ValorSalario * (porcentagemBonificacao/100d);

    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalario=" + ValorSalario +
                ", endereco=" + endereco.getBairro() +
                ", ValorBonificacao=" + this.valorDaBonificação +
                '}';
    }


}
