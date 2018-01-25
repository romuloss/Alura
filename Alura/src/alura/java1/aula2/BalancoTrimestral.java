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
public class BalancoTrimestral {
    
    public static void main (String [] args){
        
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco ;
        //System.out.println("Gasto trimestral:" + gastosTrimestre );
        
         int mediaMensal = gastosTrimestre / 3 ; 
         
         System.out.println("Gasto trimestral:" + gastosTrimestre + " Valor da média mensal:" + mediaMensal);
        
         
        int i = 298;
        while(i < 300 && i >=0){
            System.out.println(i);
            i = i  - 2;
        }
    }
    
}
