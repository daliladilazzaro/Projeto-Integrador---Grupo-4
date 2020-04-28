/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import java.util.ArrayList;
import java.util.Scanner;
import rpg.Perguntas;

/**
 *
 * @author kujikeo
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Perguntas pg = new Perguntas();
//        ArrayList perguntas = pg.ask();
//        
        int inst, jog, cred, menu;
        String respostas[] = new String[12];
        Scanner ler = new Scanner(System.in);        
        boolean sair = false;        
        do {
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma das opções acima: ");
            menu=ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Instrução");
                    break;
                case 2:
//                    System.out.println(perguntas.get(0));
//                    System.out.println("Digite a opcao: ");
//                    respostas[0] = ler.next();
//                    System.out.println("resposta: " +mostrarRespsotas(respostas)); 
                    
                    break;
                case 3:
                    System.out.println("Creditos");
                    break;
                case 4:
                    sair =true;
                    break;
            }          
        } while (!sair);   System.out.println("Até breve!");
        
        
    }
    
//  static String mostrarRespsotas (String[] list){
//       
//    return list[0];
//    
//   }
//    
    
    
}
