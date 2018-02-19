/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Collections;

import java.util.List;

/**
 *
 * @author JG40
 */
public class TestaCurso {
    
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();
        
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylilst",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",21));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));
        
        System.out.println(javaColecoes.getAulas());        
        
        
        
    }
    
}
