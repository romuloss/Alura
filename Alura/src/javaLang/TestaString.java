/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLang;

/**
 *
 * @author JG40
 */
public class TestaString {
    public static void main(String[] args){
        String s = " fk11 ";
        String outra = s.replaceAll("1", "2");
        System.out.println(s.indexOf("11",0));
        System.out.println(outra.trim());
        System.out.println(outra.trim().length());
        
        
    }
}
