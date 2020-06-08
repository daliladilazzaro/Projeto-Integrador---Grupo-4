/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kujikeo
 */
public class Main {

    //instnciamos globalmente o leitor 
    static Scanner ler = new Scanner(System.in);
    static String nome = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        System.out.print("Bem vindo(a)! Por favor, informe o nome do jogador: ");
        nome = ler.next();  
        menu();
    }

    static void imprimirMenu() {
        System.out.println("");
        System.out.println("#                                                  #     #                                             ");
        System.out.println("#       # #####  ###### #####     #####  ######    ##    # ######  ####   ####   ####  #  ####   ####  ");
        System.out.println("#       # #    # #      #    #    #    # #         # #   # #      #    # #    # #    # # #    # #      ");
        System.out.println("#       # #    # #####  #    #    #    # #####     #  #  # #####  #      #    # #      # #    #  ####  ");
        System.out.println("#       # #    # #      #####     #    # #         #   # # #      #  ### #    # #      # #    #      # ");
        System.out.println("#       # #    # #      #   #     #    # #         #    ## #      #    # #    # #    # # #    # #    # ");
        System.out.println("####### # #####  ###### #    #    #####  ######    #     # ######  ####   ####   ####  #  ####   ####  ");
        System.out.println("");
    }

    static List<String> criarQuestoes() {
        
        //criação do ArrayList de questões
        List<String> question = new ArrayList<>();

        //Adicionando perguntas aos indexs
        question.add(nome + " nem todos os funcionários te conhecem, e o restante da organização estão empolgados para te conhecer melhor, e saber suas propostas de como\n"
                + " irá superar essa crise financeira que a empresa está enfrentando, então você decide: \n");

        question.add("Após apresentação para o restante dos colaboradores, você decidiu se comunicar com o Recursos Humanos da empresa, sobre carga horária\n"
                + " dos funcionários, benefícios, salários e bonificações. Os operários que trabalham com máquinas, estava com 20% com sazonalidade, ou seja, \n"
                + "não estavam produzindo, e o restante estava trabalhando 10 horas a mais, inclusive aos sábados, com ganhos de horas extra, o que também não \n"
                + " estava bom para a empresa. Alguns faziam apenas 30min de almoço, que foi combinado que nesse período não iriam bater o ponto, além de os \n"
                + "benefícios seriam pagos pela metade, suspendendo o plano de saúde. Para a equipe de vendas, eles estavam trabalhando com 2h a mais, inclusive \n"
                + "aos sábados, e domingos, e foi combinado que não teriam bonificações de vendas naquele ano, alguns saiam de almoço e não voltavam para a empresa. \n" 
                + nome + ", os demais setores, estavam fazendo 2h a mais, com pagamento de hora extra, sendo que 3h era de almoço, com os benefícios nas mesmas condições, \n"
                + "então o que você decide: ");

        question.add("Querendo conhecer bem a organização, identificou que o setor de compras bem como almoxarifado, percebeu que os setores não estavam\n"
                + " conversando entre si, então" + nome + ", havia materiais em excesso, como mouses, teclados, monitores, e grampeadores que pelo tanto \n"
                + "de tempo parado, já estavam bem empoeirados, e percebeu também que outros materiais estavam em falta, como canetas e cadernos, o que \n"
                + "estava fazendo os funcionários trazer de suas casas. O setor de compras disse que quem deve monitorar isto, é o almoxarifado, já que \n"
                + "eles apenas efetuavam as compras que lhe eram solicitadas. Já o almoxarifado, informou que não estava ciente disto, já que eles fazem \n"
                + "os pedidos das compras conforme solicitação dos demais funcionários da empresa. Diante dessa situação " + nome + ", o que você faz: ");

        question.add("Verificando os setores de almoxarifado e compras, ele percebe que o notebook da vendedora quebrou, o que pode atrapalhar as vendas, \n"
                + "já que ela passa a maior parte fazendo visita as empresas, fazendo negociações, porém " + nome + ", o RH soube e não acha justo que \n"
                + "compre apenas para ela, alegando que todos da empresa também precisam de novos computadores e notebooks, para mantê-los  motivados, \n"
                + "então você decide: ");

        question.add(nome + ", uma das suas grandes preocupações, é com os gastos desnecessários. Então você sentou com o financeiro para ver como estavam \n"
                + "as despezas por departamento, e contatou que eles estavam acima do proposto, que é uma quantidade de até R$ 2.500,00 por setor. \n"
                + "Uma regra que não estava sendo respeitada, já que estavam superando o valor de R$ 5.000,00, então você decide: ");

        question.add("De acordo com a localização da empresa, você identificou que o valor do aluguel da empresa não compromete a situação da financeira,\n"
                + " o que é bom, já que você se preocupa bastante com os custos que ela pode enfrentar sobre, porém, o local não é acessível para os \n"
                + "funcionários, então " + nome + ", o que você decide: ");
        //retornando lista de questões
        return question;
    }

    static String[][] criarAlternativas() {

        //Criando Array Bidimenssional com base nos index das perguntas
        String alternativas[][] = {
            ///QUESTAO 1 (0 no ArrayList)
            {"A) Manda-los ao trabalho, já que a empresa está em uma situação de risco financeiro; \n",
                "B) Cumprimenta todos, um a um, informando que não precisaram se preocupar com nada, pois você está sob controle de tudo, e aproveita \n"
                + "e toma café da manhã com eles; \n",
                "C) Apenas mande todos irem trabalhar; \n",
                "D) Faz uma reunião coletiva, se apresentando, e informando a todos a situação atual da empresa, pedindo a compreensão de todos, e \n"
                + "pedindo para que todos se unem para manter a empresa, e superar esta crise.\n"
            },
            //QUESTAO 2 (1 no ArrayList)
            {"A) Conversa com o RH para a demissão com justa causa, ou seja, serem demitidos sem seus direitos, de todos que não estão agindo de forma adequada. \n",
                "B) Começa mudança nos setores, com mais monitoramento, acerta os valores devidos, e distribui as atividades de forma que não deixem uns com mais \n"
                + " serviços que outros, e evitando as horas extras, e respeitando a hora de almoço. \n",
                "C) Pede para o RH decidir o que é melhor, já que ele está lá por mais tempo, e sabe o que é melhor para empresa. \n",
                "D) Conversa com os funcionários, em seus respectivos setores, é transparente com a situação atual, e pede colaboração de todos, e pede sugestões \n"
                + "de melhoria, informando que os valores serão acertados, e remanejamento de horários para evitar horas extras, e que caso não haja melhoras, ocorrerá \n"
                + "o desligamento daqueles que não cumprirem as novas normas.  \n"
            },
            //QUESTAO 3 (2 no ArrayList)
            {"A) Determina que qualquer compra na empresa, terá que passar por análise pelo almoxarifado, para depois passar pelo setor de compras \n",
                "B) Demite estes funcionários responsáveis do setor, pela incompetência de não terem se atentado com este controle.  \n",
                "C) Informa que todos deveram conversar com o setor de compras antes, já que eles fazem controle de nota fiscal, eles tem de saber como \n"
                + "está os materiais, e depois conversar com o setor de almoxarifado. \n",
                "D) Matem como está, já que ninguém tem culpa de ter chegado a este estado, por isso deixa que eles resolvam como acham melhor, já que quem \n"
                + "está trabalhando com aquilo, sabe melhor que o chefe que não está lá no dia a dia.  \n"
            },
            //QUESTAO 4 (3 no ArrayList)
            {"A) Concorda com o RH, e faz o pedido para comprar computadores para todos, bem como, máquinas novas, e faz doação com os antigos. \n",
                "B) Concorda com o RH, e faz o pedido para comprar computadores para todos, e coloca para vender no mercado livre os computadores antigos. \n",
                "C) Não compra nenhum, e fala para vendedora que está com problemas com o notebook comprar um novo para a empresa, já que a organização não está \n"
                + " em um bom momento. \n",
                "D) Compra para a vendedora, e pede para o setor de T.I. verificar se há mais algum com problemas, para evitar atrasos. \n"
            },
            //QUESTAO 5 (4 no ArrayList)
            {"A) Crie uma política de controle de gastos, onde tudo que for custo da empresa será necessária sua assinatura para aprovação. \n",
                "B) Cria uma reunião para estipular os gastos mensais por departamento, com a presença dos gestores de cada área. \n",
                "C) Mantém como está, pois estes custos não interferem nos gastos financeiros da empresa. \n",
                "D) Crie sozinho um calendário e impões a quantidade de gastos mensais de cada departamento. \n "
            },
            //QUESTAO 6 (5 no ArrayList)
            {"A) Muda a empresa para uma região mais desenvolvida, mas que é de fácil acesso para a maioria dos funcionários. \n",
                "B) Continua no mesmo local, e oferece fretado para os funcionários em uma estação de trem próxima. \n",
                "C) Vai para uma região mais afastada para pagar aluguel mais barato, e paga uber para cada um dos funcionários para não se preocupar com distancia. \n",
                "D) Continua no mesmo local, e solicita para que estão descontentes, se desligarem da empresa. \n"
            }
        };
        return alternativas;
    }

    static void questoes(List<String> questions, String[][] alternativas) {

        //Instancia a class Random
        Random gerador = new Random();

        //vetor para guardar os index ja gerados no for que mostra as perguntas
        int vetor[] = {10, 10, 10, 10, 10, 10};

        //Ira anotar as alternativas como resposta
        List<String> respostas = new ArrayList<>();

        //aqui eh o limite de perguntas, pro for nao ultrapassar
        int contador = 6;

        //variavel de flag para verificar se alguma pergunta ja foi exibida
        boolean valorExistente = false;

        // variavel auxiliar que foi iniciada so pra primeira afirmacao ser verdadeira
        int auxiliar = 10;
        //for para percorrer perguntas e alternativas
        for (int i = 0; i < contador; i++) {

            //gera um numero randomico de 0 a 5 e atribui ao index
            int index = gerador.nextInt(6);

            //se INDEX numero gerado for igual a variavel auxiliar (representa o index anterior) ele nao ira continuar
            if (index != auxiliar) {
                int contator = 0;
                //percorrer o vetor para verificar se o index da pergunta ja foi exibido
                for (int x = 0; x < 6; x++) {
                    //traz o valor do vetor pra variavel
                    int valor = vetor[x];
                    //verifica se o index atual gerado pelo RANDOM eh igual o valor
                    if (index == valor) {
                        valorExistente = true;
                        contator++;
                    } else {
                        valorExistente = false;
                        if (contator >= 1) {
                            valorExistente = true;
                        }
                    }
                }

                // verifica se a variavel flag esta como false, se tiver quer dizer que o index atual nunca foi exibido
                if (valorExistente == false) {
                    //exibe o titulo da pergunta
                    System.out.println("Pergunta " + (i + 1));
                    //Com base no INDEX gerado com classe randomica pega uma pergunta do array list
                    System.out.println(questions.get(index));

                    //vai percorrer a matriz bidimenssional de ALTERNATIVAS referente a pergunta
                    for (int j = 0; j < 4; j++) {
                        System.out.println(alternativas[index][j]);
                    }
                    //duas linhas pra responder a questao
                    System.out.println("Digite a letra da alternativa: ");
                    boolean verificaAleternativa = false;

                    do {
                        respostas.add(ler.next().toUpperCase());
                        switch (respostas.get(i)) {
                            case "A":
                                verificaAleternativa = true;
                                break;
                            case "B":
                                verificaAleternativa = true;
                                break;
                            case "C":
                                verificaAleternativa = true;
                                break;
                            case "D":
                                verificaAleternativa = true;
                                break;
                            default:
                                System.out.println("Digite uma alternativa valida!");
                                respostas.remove(i);
                                break;
                        }
                    } while (!verificaAleternativa);

                    //adiciona o index inexistente ate o momento no vetor de index usados
                    vetor[i] = index;
                } else {
                    //caso o index ja tenha usado o valor do i eh decrementando pq temos que ter 6 questoes
                    i--;
                }
            } else {
                //caso index seja igual a variavel da rodada passada, o i decrementa pra mantermos 6 questoes no loop
                i--;
            }
            //atribui o index gerado atualmente na auxiliar para comparar com a proxima
            auxiliar = index;
            //reseta para ser verificado depois novamente
            valorExistente = false;
        }

        //metodo para imprimir na tela as respostas
        imprimirRespostas(respostas, vetor);
    }

    static void imprimirRespostas(List<String> respostas, int[] ordemPerguntas) {

        //instanciamos um vetor pra receber as perguntas e as porcentagens
        double vetor[][] = new double[6][5];

        for (int i = 0; i < 6; i++) {
            //para evitar paralizasao de compilacao e tratar erro
            try {
                //recebemos o retorno das porcentagens referente a alternativa escolhida do usuario
                vetor[i] = consultarPorcentagem(respostas.get(i), ordemPerguntas[i]);
                // System.out.println("QUESTOES " + ordemPerguntas[i]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //variaveis que irao computar o valor total de confianca e falencia do usuario
        double confianca = 0;
        double falencia = 0;
        //separamos as variaveis que conteram os valores totais de cada tipo de lideranca do usuario
        //auxiliares servem pra guardar os valores anteriores do for e calcular
        double estiloLiderAuto = 0;
        double auxestiloLiderAuto = 0;
        double estiloLiderLiberal = 0;
        double auxestiloLiderLiberal = 0;
        double estiloLiderDemo = 0;
        double auxestiloLiderDemo = 0;
        //fizemos um swtich para separar os tipos de lideres 
        int nomeLider = 0;
        //auxiliares servem pra guardar os valores anteriores do for e calcular
        double auxConfianca = 0;
        double auxFalencia = 0;

        //for que vai percorrer o vetor que contem as porcentagens com base nas perguntas
        for (int i = 0; i < vetor.length; i++) {
            double valor = vetor[i][3];
            nomeLider = (int) valor;
            switch (nomeLider) {
                case 0:
                    estiloLiderAuto = vetor[i][0] + auxestiloLiderAuto;
                    auxestiloLiderAuto = estiloLiderAuto;
                    break;
                case 1:
                    estiloLiderLiberal = vetor[i][0] + auxestiloLiderLiberal;
                    auxestiloLiderLiberal = estiloLiderLiberal;
                    break;
                case 2:
                    estiloLiderDemo = vetor[i][0] + auxestiloLiderDemo;
                    auxestiloLiderDemo = estiloLiderDemo;
                    break;
            }
            confianca = vetor[i][1] + auxConfianca;
            falencia = vetor[i][2] + auxFalencia;
            auxFalencia = falencia;
            auxConfianca = confianca;
        }

        if (falencia < 0) {
            System.out.println("Que pena, " + nome + "! Você conseguiu falir nossa empresa. Com base nas suas escolhas, perdemos muito dinheiro... e ficamos \n"
                    + " no negativo. " + nome + ", veja os significados dos tipos de liderança abaixo para entender o que pode ter ocorrido com a tomada de decisão, \n"
                    + "e se necessário, jogue novamente!\n");
            System.out.println("\n" + nome + ", o estilo de Liderança AUTOCRÁTICA, ela tem como foco o Chefe, e não permite abertura com os funcionários. \n"
                    + "Ele é autoritário, visão total em metas e prazos, o trabalho geralmente é hostil e sob pressão, já que estão sempre sendo supervisionados, \n"
                    + "o Autocrático não confia na sua equipe. Aquele que da Feedbacks negativos em público e não faz elogios quando é merecido, os funcionários \n"
                    + "se sentem desvalorizados e desmotivados, gerando aumento nas demissões, tendo perda de talentos. Quando questionado por um trabalho ruim, \n"
                    + "ou erro em algum projeto, ele logo procura o culpado, se livrando da responsabilidade. O nível de confiabilidade geralmente é baixo, o que é ruim, \n"
                    + "pois se sua equipe não está bem, a empresa vai mal. \n");
            System.out.println("\nJá o estilo de Liderança LIBERAL, " + nome + ", ela tem como foco a Equipe, e é o extremo oposto do estilo de liderança Autocrática, \n"
                    + "pois preza a total liberdade entre os funcionários, não há supervisão, concedendo autonomia para eles. Porém, eles não são tão levados a sério, \n"
                    + "já que eles não fazem um papel total de gestor, causando perda de prazos de entrega, gastos desnecessários. Ele geralmente não oferece feedbacks, \n"
                    + "o que pode complicar ainda mais a situação da empresa, já que os funcionários podem não se estão cometendo algum erro. O líder Liberal dificilmente \n"
                    + "demite alguém, mesmo que seja por uma justa causa, é conhecido como \"O bonzinho\", ou \"O que chora junto quando ocorre algum erro\" \n");
            System.out.println("\nAgora, o estilo de Liderança DEMOCRÁTICA, o foco no Líder e na equipe, " + nome + ". Ele conduz de forma democrática e justa as decisões \n"
                    + "da empresa e de sua equipe. Trabalha ativamente com sua equipe, os incluindo em projetos, dando espaço para sujestões, tornando um ambiente mais leve, \n"
                    + " com comunicação direta e assertiva. Os feedbacks são constantes, ele elogia em público, e chama a atenção em particular. Ele se preocupa com o bem estar \n"
                    + "coletivo, no desenvolvimento profissional, e oportunidades reais de crescimento, o que os estimula a criatividade e desempenho para bater metas, tornando \n"
                    + "o serviço mais produtivo. Isso faz com que a rotatividade seja menor, com colaboradores mais empenhados e motivados. Quando ocorre um erro, o líder Democrático, \n"
                    + "assume a culpa perante a sua equipe, e depois a reune, para buscar a solução juntos. Para o Democrático, quem tem equipe, tem tudo. \n");

        } else {
            if (estiloLiderAuto > estiloLiderLiberal) {
                if (estiloLiderAuto > estiloLiderDemo) {
                    float porcentagem = (float) estiloLiderAuto;
                    System.out.println("Parabens, " + nome + "! O seu estilo de liderança com base nas suas decisões, é AUTOCRÁTICO, com porcentagem de: " + porcentagem + "% \n" 
                            + " A equipe tem confiança de " + confianca + "%" + " e a porcentagem de falência foi de " + falencia + "%. " + nome + ", confira abaixo a explicação \n"
                            + " de cada tipo de líder, e caso prefira, jogue novamente! \n");
                    System.out.println("\n" + nome + ", o estilo de Liderança AUTOCRÁTICA, ela tem como foco o Chefe, e não permite abertura com os funcionários. Ele é autoritário, \n"
                            + " visão total em metas e prazos, o trabalho geralmente é hostil e sob pressão, já que estão sempre sendo supervisionados, o Autocrático não confia na \n"
                            + " sua equipe. Aquele que da Feedbacks negativos em público e não faz elogios quando é merecido, os funcionários se sentem desvalorizados e desmotivados, \n"
                            + "gerando aumento nas demissões, tendo perda de talentos. Quando questionado por um trabalho ruim, ou erro em algum projeto, ele logo procura o culpado, \n"
                            + "se livrando da responsabilidade. O nível de confiabilidade geralmente é baixo, o que é ruim, pois se sua equipe não está bem, a empresa vai mal. \n");
                    System.out.println("\nJá o estilo de Liderança LIBERAL, " + nome + ", ela tem como foco a Equipe, e é o extremo oposto do estilo de liderança Autocrática, \n"
                            + "pois preza a total liberdade entre os funcionários, não há supervisão, concedendo autonomia para eles. Porém, eles não são tão levados a sério, \n"
                            + "já que eles não fazem um papel total de gestor, causando perda de prazos de entrega, gastos desnecessários. Ele geralmente não oferece feedbacks, \n"
                            + "o que pode complicar ainda mais a situação da empresa, já que os funcionários podem não se estão cometendo algum erro. O líder Liberal dificilmente \n"
                            + "demite alguém, mesmo que seja por uma justa causa, é conhecido como \"O bonzinho\", ou \"O que chora junto quando ocorre algum erro\" \n");
                    System.out.println("\nAgora, o estilo de Liderança DEMOCRÁTICA, foco no Líder e na equipe, " + nome + ". Ele conduz de forma democrática e justa as decisões da \n"
                            + "empresa e de sua equipe. Trabalha ativamente com sua equipe, os incluindo em projetos, dando espaço para sujestões, tornando um ambiente mais leve, \n"
                            + "com comunicação direta e assertiva. Os feedbacks são constantes, ele elogia em público, e chama a atenção em particular. Ele se preocupa com o bem \n"
                            + "estar coletivo, no desenvolvimento profissional, e oportunidades reais de crescimento, o que os estimula a criatividade e desempenho para bater metas, \n"
                            + "tornando o serviço mais produtivo.Isso faz com que a rotatividade seja menor, com colaboradores mais empenhados e motivados. Quando ocorre um erro, \n"
                            + "o líder Democrático, assume a culpa perante a sua equipe, e depois a reune, para buscar a solução juntos. Para o Democrático, quem tem equipe, tem tudo. \n");
                } else {
                    float porcentagem = (float) estiloLiderDemo;
                    System.out.println("Parabéns, " + nome + "! O seu estilo de liderança com base nas suas decisões, é DEMOCRÁTICO, deu uma procentagem de:  " + porcentagem + "% \n" 
                            + "  A equipe tem onfiança " + confianca + "%" + " e a porcentagem de falência foi de " + falencia + "%. " + nome + ", confira abaixo a explicação de cada \n"
                            + "tipo de líder, e caso prefira, jogue novamente! \n");
                    System.out.println("\n" + nome + ", o estilo de Liderança AUTOCRÁTICA, ela tem como foco o Chefe, e não permite abertura com os funcionários. Ele é autoritário, \n"
                            + " visão total em metas e prazos, o trabalho geralmente é hostil e sob pressão, já que estão sempre sendo supervisionados, o Autocrático não confia na \n"
                            + "sua equipe. Aquele que da Feedbacks negativos em público e não faz elogios quando é merecido, os funcionários se sentem desvalorizados e desmotivados, \n"
                            + "gerando aumento nas demissões, tendo perda de talentos. Quando questionado por um trabalho ruim, ou erro em algum projeto, ele logo procura o culpado, \n"
                            + "se livrando da responsabilidade. O nível de confiabilidade geralmente é baixo, o que é ruim, pois se sua equipe não está bem, a empresa vai mal. \n");
                    System.out.println("\nJá o estilo de Liderança LIBERAL, " + nome + ", ela tem como foco a Equipe, e é o extremo oposto do estilo de liderança Autocrática, \n"
                            + "pois preza a total liberdade entre os funcionários, não há supervisão, concedendo autonomia para eles. Porém, eles não são tão levados a sério, \n"
                            + "já que eles não fazem um papel total de gestor, causando perda de prazos de entrega, gastos desnecessários. Ele geralmente não oferece feedbacks, \n"
                            + "o que pode complicar ainda mais a situação da empresa, já que os funcionários podem não se estão cometendo algum erro. O líder Liberal dificilmente \n"
                            + " demite alguém, mesmo que seja por uma justa causa, é conhecido como \"O bonzinho\", ou \"O que chora junto quando ocorre algum erro\" \n");
                    System.out.println("\nAgora, o estilo de Liderança DEMOCRÁTICA, foco no Líder e na equipe, " + nome + ". Ele conduz de forma democrática e justa as decisões \n"
                            + "da empresa e de sua equipe. Trabalha ativamente com sua equipe, os incluindo em projetos, dando espaço para sujestões, tornando um ambiente mais leve,\n"
                            + " com comunicação direta e assertiva. Os feedbacks são constantes, ele elogia em público, e chama a atenção em particular. Ele se preocupa com o bem estar \n"
                            + "coletivo, no desenvolvimento profissional, e oportunidades reais de crescimento, o que os estimula a criatividade e desempenho para bater metas, tornando \n"
                            + "o serviço mais produtivo. Isso faz com que a rotatividade seja menor, com colaboradores mais empenhados e motivados. Quando ocorre um erro, o líder Democrático, \n"
                            + "assume a culpa perante a sua equipe, e depois a reune, para buscar a solução juntos. Para o Democrático, quem tem equipe, tem tudo. \n");
                }
            } else if (estiloLiderLiberal > estiloLiderDemo) {
                float porcentagem = (float) estiloLiderLiberal;
                System.out.println("Parabéns, " + nome + "! O seu estilo de liderança com base nas suas decisões, é LIBERAL, deu uma procentagem de:  " + porcentagem + "% \n" 
                        + " A equipe tem confiança " + confianca + "%" + " e a porcentagem de falência foi de " + falencia + "%. " + nome + ", confira abaixo a explicação \n"
                        + "de cada tipo de líder, e caso prefira, jogue novamente!\n");
                System.out.println("\n" + nome + ", o estilo de Liderança AUTOCRÁTICA, ela tem como foco o Chefe, e não permite abertura com os funcionários. Ele é autoritário, \n"
                        + " visão total em metas e prazos, o trabalho geralmente é hostil e sob pressão, já que estão sempre sendo supervisionados, o Autocrático não confia na \n"
                        + " sua equipe. Aquele que da Feedbacks negativos em público e não faz elogios quando é merecido, os funcionários se sentem desvalorizados e desmotivados, \n"
                        + "gerando aumento nas demissões, tendo perda de talentos. Quando questionado por um trabalho ruim, ou erro em algum projeto, ele logo procura o culpado, \n"
                        + "se livrando da responsabilidade. O nível de confiabilidade geralmente é baixo, o que é ruim, pois se sua equipe não está bem, a empresa vai mal. \n");
                System.out.println("\nJá o estilo de Liderança LIBERAL, " + nome + ", ela tem como foco a Equipe, e é o extremo oposto do estilo de liderança Autocrática, \n"
                        + "pois preza a total liberdade entre os funcionários, não há supervisão, concedendo autonomia para eles. Porém, eles não são tão levados a sério, \n"
                        + "já que eles não fazem um papel total de gestor, causando perda de prazos de entrega, gastos desnecessários. Ele geralmente não oferece feedbacks, \n"
                        + " o que pode complicar ainda mais a situação da empresa, já que os funcionários podem não se estão cometendo algum erro. O líder Liberal dificilmente \n"
                        + " demite alguém, mesmo que seja por uma justa causa, é conhecido como \"O bonzinho\", ou \"O que chora junto quando ocorre algum erro\" \n");
                System.out.println("\nAgora, o estilo de Liderança DEMOCRÁTICA, foco no Líder e na equipe, " + nome + ". Ele conduz de forma democrática e justa as decisões da \n"
                        + "empresa e de sua equipe. Trabalha ativamente com sua equipe, os incluindo em projetos, dando espaço para sujestões, tornando um ambiente mais leve, \n"
                        + " com comunicação direta e assertiva. Os feedbacks são constantes, ele elogia em público, e chama a atenção em particular. Ele se preocupa com o bem \n"
                        + "estar coletivo, no desenvolvimento profissional, e oportunidades reais de crescimento, o que os estimula a criatividade e desempenho para bater metas, \n"
                        + "tornando o serviço mais produtivo. Isso faz com que a rotatividade seja menor, com colaboradores mais empenhados e motivados. Quando ocorre um erro, \n"
                        + "o líder Democrático, assume a culpa perante a sua equipe, e depois a reune, para buscar a solução juntos. Para o Democrático, quem tem equipe, tem tudo. \n");
            } else {
                float porcentagem = (float) estiloLiderDemo;
                System.out.println("Parabéns, " + nome + "! O seu estilo de liderança com base nas suas decisões, é DEMOCRÁTICO, deu uma procentagem de:  " + porcentagem + "%\n" 
                        + " A equipe tem confiança " + confianca + "%" + " e a porcentagem de falência foi de " + falencia + "%. " + nome + ", confira abaixo a explicação de \n"
                        + "cada tipo de líder, e caso prefira, jogue novamente!\n");
                System.out.println("\n" + nome + ", o estilo de Liderança AUTOCRÁTICA, ela tem como foco o Chefe, e não permite abertura com os funcionários. Ele é autoritário, \n"
                        + "visão total em metas e prazos, o trabalho geralmente é hostil e sob pressão, já que estão sempre sendo supervisionados, o Autocrático não confia na sua equipe. \n"
                        + "Aquele que da Feedbacks negativos em público e não faz elogios quando é merecido, os funcionários se sentem desvalorizados e desmotivados, gerando aumento nas demissões, \n"
                        + " tendo perda de talentos. Quando questionado por um trabalho ruim, ou erro em algum projeto, ele logo procura o culpado, se livrando da responsabilidade. \n"
                        + "O nível de confiabilidade geralmente é baixo, o que é ruim, pois se sua equipe não está bem, a empresa vai mal.\n");
                System.out.println("\nJá o estilo de Liderança LIBERAL, " + nome + ", ela tem como foco a Equipe, e é o extremo oposto do estilo de liderança Autocrática, pois preza a total \n"
                        + "liberdade entre os funcionários, não há supervisão, concedendo autonomia para eles. Porém, eles não são tão levados a sério, já que eles não fazem um papel total de gestor, \n"
                        + "causando perda de prazos de entrega, gastos desnecessários. Ele geralmente não oferece feedbacks, o que pode complicar ainda mais a situação da empresa, já que os funcionários \n"
                        + " podem não se estão cometendo algum erro. O líder Liberal dificilmente demite alguém, mesmo que seja por uma justa causa, é conhecido como \"O bonzinho\", ou \"O que chora \n"
                        + "junto quando ocorre algum erro\" \n");
                System.out.println("\nAgora, o estilo de Liderança DEMOCRÁTICA, foco no Líder e na equipe, " + nome + ". Ele conduz de forma democrática e justa as decisões da empresa e de sua equipe. \n"
                        + "Trabalha ativamente com sua equipe, os incluindo em projetos, dando espaço para sujestões, tornando um ambiente mais leve, com comunicação direta e assertiva. Os feedbacks são \n"
                        + "constantes, ele elogia em público, e chama a atenção em particular. Ele se preocupa com o bem estar coletivo, no desenvolvimento profissional, e oportunidades reais de crescimento, \n"
                        + "o que os estimula a criatividade e desempenho para bater metas, tornando o serviço mais produtivo. Isso faz com que a rotatividade seja menor, com colaboradores mais empenhados e motivados. \n"
                        + "Quando ocorre um erro, o líder Democrático, assume a culpa perante a sua equipe, e depois a reune, para buscar a solução juntos. Para o Democrático, quem tem equipe, tem tudo. \n");
            }
        }
    }

    public  static double[] consultarPorcentagem(String resposta, int numeroPergunta) {
        //Essa variavel vai determinar o valor da alternativa respondida de 0 a 3 , representando a posicao das alternativas no array tridimenssional
        int alternativaEmInteiro = 0;

        switch (resposta) {
            case "A":
                alternativaEmInteiro = 0;
                break;
            case "B":
                alternativaEmInteiro = 1;
                break;
            case "C":
                alternativaEmInteiro = 2;
                break;
            case "D":
                alternativaEmInteiro = 3;
                break;
            default:
                 System.out.println("Erro alternativa");
            break;
        }

//        TABELA dos valores
//        autocratico = 0
//        liberal = 1
//        democratico = 2
        //Instanciamos um double tridimensional com os valores das porcentagens ja definidas com base nas altetnativas 
        //[0] o primeiro significa a questao (no caso no arraylist 0 eh a primeira questao)
        //[0] [0] o segundo a alternativa (no caso A conforme o swtich case)
        //[0] [0] [0] ja o terceiro, fica as porcentagens cadastradas referente a alternativa A da pergunta 1 (0 no ArrayList)
        double alternativas[][][] = {
            {
                {16.67, -15, -5, 0},
                {16.67, 15, 20, 1},
                {16.67, -15, -5, 0},
                {16.67, 15, -10, 2}
            },
            {
                {16.67, -15, 30, 0},
                {16.67, 15, -25, 2},
                {16.67, -15, 20, 1},
                {16.67, 15, -25, 2}
            },
            {
                {16.67, 20, -15, 2},
                {16.67, -20, 20, 0},
                {16.67, 20, 10, 1},
                {16.67, 20, 10, 1}
            },
            {
                {16.67, 15, 30, 1},
                {16.67, 15, 30, 1},
                {16.67, -15, 20, 0},
                {16.67, 15, -10, 2}
            },
            {
                {16.67, -15, -5, 0},
                {16.67, 15, -20, 2},
                {16.67, 15, 20, 1},
                {16.67, -15, -5, 0}
            },
            {
                {16.67, 20, -20, 2},
                {16.67, 20, -20, 2},
                {16.67, 20, -20, 1},
                {16.67, -20, 30, 0}
            },};
        //Criar um vetor pra receber as porcentagens da alternativa escolhida
        double vetor[] = new double[4];

        //vamos percorrer nosso tridimenssional, mas apenas no ultimo index, ou seja, das porcentagens
        for (int i = 0; i < 4; i++) {
            //try obrigatorio para evitar erros na compilacao e travar o programa
            try {
                //iremos atribuir no vetor as porcentagens das ALTERNATIVAS
                //repare que os paramos das [] [] sao os valores passados por parametro no metodo e o valor da resposta baseado no swtch case
                vetor[i] = alternativas[numeroPergunta][alternativaEmInteiro][i];
                //System.out.println(vetor[i]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        //retornamos as porcentagens com base na alternativa escolhida
        return vetor;
    }

    private static void menu() {
        boolean resultado = false;
        boolean sair = false;
        int menu;
        do {
       
            imprimirMenu();
            System.out.println("1 - Introdução");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            menu = ler.nextInt();

            sair = menuOpcoes(menu);
       
        } while (!sair);
        System.out.println("Obrigado(a) por jogar, " + nome + "! Até breve!");
    }

    public static Boolean  menuOpcoes(int menu) {
        
       boolean sair = false;
        List<String> questions = criarQuestoes();
        String[][] alternativas = criarAlternativas();
        switch (menu) {
                case 1:
                    System.out.println("\n" + nome + ", o jogo se baseia em uma fabricante de celulares, Cia dos Celulares S/A, é uma Sociedade Anônima, de natureza privada, constituída por \n"
                            + "empreendedores, revolucionando no ramo eletrônico, com sua visão, missão e valores.\n"
                            + "De acordo com algumas tomadas de decisões do gestor anterior, a empresa está passando por algumas dificuldades financeiras, e cabe você, " + nome + ", \n"
                            + "reergue-la, de acordo com as tomadas de decisões!  \n"
                            + "Vamos jogar?\n");
                    break;
                case 2:
                    questoes(questions, alternativas);
                    break;
                case 3:
                    System.out.println("\n" + nome + ", o jogo contou com a colaboração dos Alunos da turma do primeiro semestre-B de Análise e Desenvolvimento de Sistemas,\n "
                            + "do Centro Universitário SENAC:\n"
                            + "Dalila Di Lazzaro, \n"
                            + "Guilherme Caçapava, &\n"
                            + "Vinicius Amorim de Andrade.");
                    break;
                case 4:
                    sair = true;
                    break;
                    
                default:
                    System.out.println("Digite algo valído!");
                    break;
            }
        
        return sair;
    }
}
