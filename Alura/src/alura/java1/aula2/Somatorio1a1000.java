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
public class Somatorio1a1000 {
    
    public static void main(String [] args){
    int somatorio = 0;
        for (int i = 0; i <= 1000; i++) {
            somatorio = somatorio + i;
        }
        
        System.out.println("Somatório:" + somatorio);
    }
        
    
}
