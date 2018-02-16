/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLang;

import java.io.PrintStream;

/**
 *
 * @author JG40
 */
public class TestaInteger {

    public static void main(String[] args){
        
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);
        Integer.parseInt("1");
        PrintStream saida = System.out;
        saida.println("ola");
        if(x1.equals(x2)){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }
        
    }
    
}
