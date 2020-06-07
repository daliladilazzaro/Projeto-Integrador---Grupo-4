/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import static rpg.Main.consultarPorcentagem;

/**
 *
 * @author kujikeo
 */
public class Teste {

    public static void main(String[] args) {
        /*  Vamos testar escolhendo alterntiva da pergunta 0 (1 no word)*/
        String alternativa = "A";
        /*Usuario passar uma alternativa inexistente*/
        String alternativaNaoexistente = "165";

        int numeroPergunta = 0;

        teste_consultarPorcentagem(alternativa, numeroPergunta);

        teste_consultarPorcentagem(alternativaNaoexistente, numeroPergunta);

        teste_menu();

    }

//    teste de funcoes
    private static void teste_consultarPorcentagem(String alternativa, int numeroPergunta) {

        /*criando um vetor para receber as tres porcentagens da alternativa A da pergunta 0 (1 no word) e tambem o tipo de lider */
        double vetor[] = new double[4];
        /**/
        String respostaTeste = "";
        /*Recebendo os valores da funcao*/
        vetor = Main.consultarPorcentagem(alternativa, numeroPergunta);
        /*Verifica conforme a tabela da funcao*/
        if (vetor != null) {
            System.out.println("Sucesso");
        } else {
            System.out.println("Erro no teste");
        }

    }

    // teste menu
    private static void teste_menu() {

        int menu = 0;
        boolean sair = Main.menuOpcoes(menu);

        if (!sair) {
            System.out.println("Nao saiu");
        }else{
            System.out.println("Saiu");
          }

    }
    
    
}
