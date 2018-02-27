/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author JG40
 */
public class TesteLambdaCurso {
    public static void main(String[] args) {
        
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Pyton",45));
        cursos.add(new Curso("Javascript",150));
        cursos.add(new Curso("Java 8",113));
        cursos.add(new Curso("C",55));
        
        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(c -> System.out.println(c.getNome()));
        System.out.println("Filtro Menor que 50 alunos ----------");
        cursos.stream()
                .filter (c -> c.getAlunos() > 50)
                .forEach(c -> System.out.println(c.getNome()));
        
        System.out.println("Map String Nome de Aluno ----------");
        Stream<String> nomes = cursos.stream().map(Curso::getNome);
        nomes.forEach(System.out::println);
        
        System.out.println("Map String Qtd de Alunos ----------");
        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(Curso::getAlunos)
                .forEach(System.out::println);
        
        
    }
}
