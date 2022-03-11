package com.packade.models;

import com.packade.models.CalculaBonificacao;
import com.packade.models.FuncionarioPJ;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double ValorBonificacao;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.ValorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;

    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getRua() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", ValorHora=" + super.getValorHora() +
                ", ValorRemuneracao=" + super.getValorRemuneracao() +
                ", ValorBonificacao=" + this.ValorBonificacao +
                '}';
    }


}
