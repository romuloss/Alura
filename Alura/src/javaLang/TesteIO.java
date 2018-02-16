/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


/**
 *
 * @author JG40
 */
public class TesteIO {
    
    public static void main(String[] args) throws IOException{
        
       
        BufferedReader br;
        br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("src/javaLang/arquivo.txt")));
        
   
        
        
        //System.out.println("Digite sua mensagem:");
        String linha = br.readLine(); // primeira linha
        while(linha != null){
            System.out.println(linha.concat("-"));
            linha = br.readLine();
            
        }
        br.close();
    }
    
}
