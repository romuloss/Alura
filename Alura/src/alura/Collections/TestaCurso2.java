/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author JG40
 */
public class TestaCurso2 {
    
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylilst",20));
        javaColecoes.adiciona(new Aula("Criando uma aula",21));
        javaColecoes.adiciona(new Aula("Modelando com coleções",24));
        
             
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        System.out.println(aulas);
        
        Collections.sort(aulas);
        System.out.println(aulas);
        
        System.out.println(javaColecoes.getTempoTotal());
        
        System.out.println(javaColecoes);
        
        
        
    }
    
}
