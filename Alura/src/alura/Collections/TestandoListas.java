/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JG40
 */
public class TestandoListas {
    
     public static void main(String[] args){
         String aula1 = "Conhecendo mais de listas";
         String aula2 = "Modelando a classe aula";
         String aula3 = "Trabalhando com Cursos e Sets";
         
         ArrayList<String> aulas = new ArrayList<>();
         aulas.add(aula1);
         aulas.add(aula2);
         aulas.add(aula3);
      
         System.out.println(aulas);
         
         aulas.remove(0);
         
         System.out.println(aulas);
         
         for (String aula: aulas){
             System.out.println("Aula: " + aula);
         }
         
         String primeiraAula = aulas.get(0);
         System.out.println("Primeira aula é: " + primeiraAula);
         
         for (int i = 0; i < aulas.size(); i++){
             System.out.println("Aula: " + aulas.get(i));
         }
         
         System.out.println(aulas.size());
         
         aulas.forEach(item  -> {
             System.out.println("percorrendo: " + item);
         });
         
         aulas.add("Aumentando nosso conhecimento");
         System.out.println(aulas);
         Collections.sort(aulas);
         System.out.println(aulas);
         
         
     }
    
}
