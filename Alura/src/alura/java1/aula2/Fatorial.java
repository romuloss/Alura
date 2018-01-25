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
public class Fatorial {
    
    public static void main(String [] args){
        
        for (int i = 0; i <= 10; i++) {
        int fatorial = 1;    
            for (int j = 1; j <= i; j++) {
                fatorial = fatorial * j;
            }
            
            System.out.println("Fatorial de " + i + " é " + fatorial);
            
        }
        
    }
    
}
