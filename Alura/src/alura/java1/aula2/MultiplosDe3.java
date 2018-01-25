/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.java1.aula2;

/**
 *
 * @author JG40
 */
public class MultiplosDe3 {
    
    public static void main(String[] args){
        
        for (int i = 0; i < 100; i++) {
            
            if ((i % 3) == 0){
                System.out.println("Multiplo de 3: " + i);
            }
        }
        
         for (int i = 0; i < 100; i+=3) {
                System.out.println("Multiplo de 3: " + i);
        }
    }
    
}
