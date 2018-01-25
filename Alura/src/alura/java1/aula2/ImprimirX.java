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
public class ImprimirX {
    
    public static void main (String [] arg){
        
        int x = 13;
                
        while(x!=1){
            
            if(x % 2 == 0){
                x = x / 2;
            }else{
                x = 3 * x + 1;
            }
            
            System.out.print(x + ">");
        }
                
    }
    
}
