/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kujikeo
 */
public class Main {
    
     static Scanner ler = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menu;

        boolean sair = false;

        List<String> questions = criarQuestoes();
        List<String> alternativas = criarAlternativas();

        do {
            imprimirMenu();
            System.out.println("1 - Introdução");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            menu = ler.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Instrução");
                    break;
                case 2:
                    questoes(questions, alternativas);
                    break;
                case 3:
                    System.out.println("Creditos");
                    break;
                case 4:
                    sair = true;
                    break;
            }
        } while (!sair);
        System.out.println("Até breve!");
    }

    static void imprimirMenu() {
        System.out.println("######  ######   ##### ");
        System.out.println("#     # #     # #     # ");
        System.out.println("#     # #     # #       ");
        System.out.println("######  ######  #  #### ");
        System.out.println("#   #   #       #     # ");
        System.out.println("#    #  #       #     # ");
        System.out.println("#     # #        #####  ");
    }

    static List<String> criarQuestoes() {
        List<String> question = new ArrayList<>();

        question.add("Os funcionários chegaram bem empolgados para conhecer o novo gestor que ajudará a organização se manter em período de crise financeira.");

        question.add("Após apresentação para todos, você decidiu se comunicar com o Recursos Humanos da empresa, sobre carga horária dos funcionários, benefícios, salários e bonificações.\n"
                + "Os operários que trabalham com máquinas, estava com 20% com sazonalidade, ou seja, não estavam produzindo, e o restante estava trabalhando 10 horas a mais, inclusive aos sábados, com ganhos de horas extra, o que também não estava bom para a empresa. Alguns faziam apenas 30min de almoço, que foi combinado que nesse período não iriam bater o ponto, além de os benefícios seriam pagos pela metade, suspendendo o plano de saúde.\n"
                + "Para a equipe de vendas, eles estavam trabalhando com 2h a mais, inclusive aos sábados, e domingos, e foi combinado que não teriam bonificações de vendas naquele ano, alguns saiam de almoço e não voltavam para a empresa. E os demais setores, estavam fazendo 2h a mais, com pagamento de hora extra, sendo que 3h era de almoço, com os benefícios nas mesmas condições.");

        question.add("Passando pelo setor de compras bem como almoxarifado, percebeu que os setores não estavam conversando entre si, havia materiais em excesso, como mouses, teclados, monitores, e grampeadores que pelo tanto de tempo parado,"
                + " já estavam bem empoeirados, e percebeu também que outros materiais estavam em falta, como canetas e cadernos, o que estava fazendo os funcionários trazer de suas casas. O setor de compras disse que quem deve monitorar isto,"
                + " é o almoxarifado, já que eles apenas efetuavam as compras que lhe eram solicitadas. "
                + "Já o almoxarifado, informou que não estava ciente disto, já que eles fazem os pedidos das compras conforme solicitação dos demais funcionários da empresa.");

        question.add("Ainda no setor de almoxarifado e compras, ele percebe que o notebook da vendedora quebrou, o que pode atrapalhar as vendas, "
                + "já que ela passa a maior parte fazendo visita as empresas, fazendo negociações, mas o RH soube e não acha justo que compre apenas para ela,"
                + " alegando que todos da empresa também precisam de novos computadores e notebooks, para mantê-los  motivados.");

        question.add("Você percebe que os gastos estão elevados, em diversos departamentos, onde estes podem gastar uma quantidade de até R$ 2.500,00."
                + " Você percebeu que em alguns setores, os gastos chegaram à R$ 5.000,00");

        question.add("Você identificou que o valor do aluguel da empresa não compromete a situação da financeira,"
                + " porém a localização e acessibilidade não é boa para os funcionários.");

        return question;
    }

    static List<String> criarAlternativas() {

        List<String> alternativas = new ArrayList<>();

        alternativas.add("A) Manda-los ao trabalho, já que a empresa está em uma situação de risco financeiro; \n"
                + "B) Cumprimenta todos, um a um, informando que não precisaram se preocupar com nada, pois você está sob controle de tudo, e aproveita e toma café da manhã com eles; \n"
                + "C) Apenas mande todos irem trabalhar; \n"
                + "D) faz uma reunião coletiva, se apresentando, e informando a todos a situação atual da empresa, pedindo a compreensão de todos, e pedindo para que todos se unem para manter a empresa, e superar esta crise. ");

        alternativas.add("A) Conversa com o RH para a demissão com justa causa, ou seja, serem demitidos sem seus direitos, de todos que não estão agindo de forma adequada. \n"
                + "B) Começa mudança nos setores, com mais monitoramento, acerta os valores devidos, e distribui as atividades de forma que não deixem uns com mais serviços que outros, e evitando as horas extras, e respeitando a hora de almoço. \n"
                + "C) Pede para o RH decidir o que é melhor, já que ele está lá por mais tempo, e sabe o que é melhor para empresa. \n"
                + "D) Conversa com os funcionários, em seus respectivos setores, é transparente com a situação atual, e pede colaboração de todos, e pede sugestões de melhoria, informando que os valores serão acertados, e remanejamento de horários para evitar horas extras, e que caso não haja melhoras, ocorrerá o desligamento daqueles que não cumprirem as novas normas.  \n");

        alternativas.add("A) Determina que qualquer compra na empresa, terá que passar por análise pelo almoxarifado, para depois passar pelo setor de compras \n"
                + "B) Demite estes funcionários responsáveis do setor, pela incompetência de não terem se atentado com este controle.  \n"
                + "C) Informa que todos deveram conversar com o setor de compras antes, já que eles fazem controle de nota fiscal, eles tem de saber como está os materiais, e depois conversar com o setor de almoxarifado. \n"
                + "D) Matem como está, já que ninguém tem culpa de ter chegado a este estado, por isso deixa que eles resolvam como acham melhor, já que quem está trabalhando com aquilo, sabe melhor que o chefe que não está lá no dia a dia.  \n");

        alternativas.add("A) Concorda com o RH, e faz o pedido para comprar computadores para todos, bem como, máquinas novas, e faz doação com os antigos. \n"
                + "B) Concorda com o RH, e faz o pedido para comprar computadores para todos, e coloca para vender no mercado livre os computadores antigos. \n"
                + "C) Não compra nenhum, e fala para vendedora que está com problemas com o notebook comprar um novo para a empresa, já que a organização não está em um bom momento. \n"
                + "D) Compra para a vendedora, e pede para o setor de T.I. verificar se há mais algum com problemas, para evitar atrasos. \n");

        alternativas.add("A) Crie uma política de controle de gastos, onde tudo que for custo da empresa será necessária sua assinatura para aprovação. \n"
                + "B) Cria uma reunião para estipular os gastos mensais por departamento, com a presença dos gestores de cada área. \n"
                + "C) Mantém como está, pois estes custos não interferem nos gastos financeiros da empresa. \n"
                + "D) Crie sozinho um calendário e impões a quantidade de gastos mensais de cada departamento. \n ");

        alternativas.add("A) Muda a empresa para uma região mais desenvolvida, mas que é de fácil acesso para a maioria dos funcionários. \n"
                + "B) Continua no mesmo local, e oferece fretado para os funcionários em uma estação de trem próxima. \n"
                + "C) Vai para uma região mais afastada para pagar aluguel mais barato, e paga uber para cada um dos funcionários para não se preocupar com distancia. \n"
                + "D) Continua no mesmo local, e solicita para que estão descontentes, se desligarem da empresa. \n");

        return alternativas;
    }

    static void questoes(List<String> questions, List<String> alternativas) {
        Random gerador = new Random();

        List<String> respostas = new ArrayList<>();
        int contador = 6;
        int auxiliar = 10;
        for (int i = 1; i <= contador; i++) {

            int index = gerador.nextInt(6);

            if (index != auxiliar) {
                System.out.println("Pergunta " + i);
                System.out.println(questions.get(index));
                System.out.println(alternativas.get(index));
                System.out.println("Digite a letra da alternativa: ");
                respostas.add(ler.next().toUpperCase());
            }
            auxiliar = index;
        }
        
        imprimirRespostas(respostas);
    }
    
    static void imprimirRespostas(List<String> respostas){
        for (int i = 0; i < respostas.size(); i++) {
            
            System.out.println("Resposta - ");
            System.out.println(respostas.get(i));
            
        }
    }
}
