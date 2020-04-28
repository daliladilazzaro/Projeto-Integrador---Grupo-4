package rpg;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kujikeo
 */
public class Perguntas {
    
   public ArrayList ask (){ 
    ArrayList<String> perguntas = new ArrayList();
    perguntas.add("Os funcionários chegaram bem empolgados para conhecer o novo gestor que ajudará a organização se manter. \n"
            + "(decisão 1: tomar decisão a partir dos tipos de liderança) \n"
            + "Você os observa e qual a sua primeira decisão, e deixar sua primeira impressão de líder: \n"
            + "A) Manda-los ao trabalho, já que a empresa está em uma situação de risco financeiro \n"
            + "B) Cumprimenta todos, um a um, informando que não precisaram se preocupar com nada, pois você está sob controle de tudo, e aproveita e toma café da manhã com eles \n"
            + "C) Apenas mande todos tabalhar \n"
            + "D) Faz uma reunião coletiva, se apresentando, e informando a todos a situação atual da empresa, pedindo comprrensão de todos, e pedindo que todos se unem para manter a empresa, e suprerar esta crise.");
     return perguntas;
  }

}
