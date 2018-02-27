/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Java8;

/**
 *
 * @author JG40
 */
public class Curso {
    
    private String nome;
    private int alunos;
    
    public Curso(String nome, int alunos){
        this.nome = nome;
        this.alunos = alunos;
                
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
    
    
}
