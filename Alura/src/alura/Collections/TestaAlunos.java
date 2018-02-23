/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author JG40
 */
public class TestaAlunos {
    public static void main(String[] args) {
        
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggaio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");
        
        
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sergio Lopes");
        System.out.println(pauloEstaMatriculado);
        
        System.out.println(alunos.size());
        
        
        
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        
        alunos.forEach(aluno ->{
            System.out.println(aluno);
        });
        
        System.out.println(alunos);
        
        
        List<String> alunosEmLista = new ArrayList<>(alunos);
        
    }
}
