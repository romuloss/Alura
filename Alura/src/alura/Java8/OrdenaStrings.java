/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author JG40
 */
public class OrdenaStrings {
    public static void main(String[] args) {
        
        List<String> palavras = new ArrayList<>();
        
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");
        
        
        Comparator<String> comparador = new ComparadorPorTamanho();
        
        //Forma Antiga
        Collections.sort(palavras, comparador);
        //Forma Lambda
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        //Forma Lambda
        palavras.sort(Comparator.comparing(s -> s.length()));
        //Forma lambda + reference
        palavras.sort(Comparator.comparing(String::length));
        //Forma lambda + referece
        palavras.sort(comparing(String::length));
        
        System.out.println(palavras);
        
        palavras.forEach(System.out::println);
        
        
//        for (String palavra : palavras) {
//            System.out.println(palavra);
//        }
        
        Consumer<String> consumidor = new ImprimeNalinha();
        palavras.forEach(consumidor);
        
        palavras.forEach( new Consumer<String>(){
            
            public void accept(String s){
                System.out.println(s);
            }
        });
        
        palavras.forEach( s ->  System.out.println(s));
        
    }
        
}


class  ImprimeNalinha implements Consumer<String>{
    public void accept(String s){
        System.out.println(s);
    }
    
}

class ComparadorPorTamanho implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
           
    }
}