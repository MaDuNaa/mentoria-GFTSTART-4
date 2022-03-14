package com.packade;

import com.packade.models.*;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	   /* Endereco endereco = new Endereco();
        endereco.setRua("testando 123 ...");
        System.out.println(endereco.getRua());*/

        System.out.println("                         B A R B E A R I A   N A S C I M E N T O");
        System.out.println("                             Lista dos nossos Colaboradores ");

        System.out.println("------------------------------------------------------------------------------------------");

        Endereco endereco =
                new Endereco("Benjamin Constant 251" , "Barbearia Nascimento" , "Centro");
        System.out.println(endereco);
        System.out.println("-----------------------------------------------------------------------------------------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Maxwenia Dantas");
        vendedor.setDocumento("345.567.890-12");
        vendedor.setValorSalario(3500d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);

        System.out.println("-----------------------------------------------------------------------------------------");

        OperadorDeCaixa operadorDeCaixa =
                new OperadorDeCaixa("Alessa" , "123.345.568-34" , (2000d), endereco);
        System.out.println(operadorDeCaixa);

        System.out.println("-----------------------------------------------------------------------------------------");

        Gerente gerente = new Gerente();
        gerente.setNome("Matheus Nascimento");
        gerente.setDocumento("490.567.345-22");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(60);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);

        System.out.println("-----------------------------------------------------------------------------------------");

        Barbeiros barbeiros = new Barbeiros("Mathias e Jhon" , "-------------" , (1500d) , endereco );
        barbeiros.calculaBonificacao();
        barbeiros.calculaBonificacao(3d);
        System.out.println(barbeiros);

        System.out.println("------------------------------------------------------------------------------------------");
    }
}
