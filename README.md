# Projeto de Funcionarios de uma Empresa

Este projeto apresenta uma empresa e seus funcionarios, nele voce pode 
cadastrar e criar cada funcionario referente aos seus cargos e tambem 
calcular as suas bonificação e seus salarios.


```bash

#Executar o projeto
Basta entrar no projeto e aperta no botao iniciar do IDE...

Feito isso ja tera acesso, ai basta olhar o console e digitar o que desejar
para funcionarios.
#É uma aplicação simples...


#PROPOSTA DO PROJETO ( mostrando a class Main para ter uma ideia)


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


```

## DESENVOLVIMENTO :

> Classe Barbeiros : 
    essa classe serve para criar um novo barbeiro...
 
> Classe Calcula Bonificação :  
    basicamente nessa classe so tem a logica de calcular a bonificação...

> Classe Endereço :  
    criando endereço em objeto para instanciar nos funcionarios...
   
> Classe FuncionarioCLT :  
    criando CLT em objeto para instanciar nos funcionarios...

> Classe FuncionarioPJ : 
    criando PJ em objeto para instanciar nos funcionarios...

> Classe Gerente :  
    essa classe serve para criar um novo gerente...

> Classe Operador de Caixa :
    essa classe serve para criar um novo operador de caixa...

> Classe Vendedor :
    essa classe serve para criar um novo vendedor...

-=======================================================================

## Como executar o projeto

Pré-requisitos: 

* Java 17 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellij IDEA
* Controle de versão GIT instalado na sua máquina.


# Tecnologias utilizadas e IDES

## Back end
- Java
- Intellij IDEA
- Orientação a objeto
- Maven
- Mysql

etc...

----------------------------------------------------------------------------------------------
## Autor
Matheus Nascimento
