/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLang;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author JG40
 */
public class EntradaDeUmArquivo {
    
    public static void main(String[] args) throws IOException {
    
        //InputStream is = new FileInputStream("src/javaLang/arquivo.txt");
        InputStream is = System.in;
        Scanner entrada = new Scanner(is);
        
     
        OutputStream os = new FileOutputStream("src/javaLang/saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        System.out.println("Digite a Mensagem:");
        while (entrada.hasNextLine()){
            String linha = entrada.nextLine();
            System.out.println(linha);
            bw.write(linha);
            bw.newLine();
            
        }
        entrada.close();
        bw.close();
    }
        
}
