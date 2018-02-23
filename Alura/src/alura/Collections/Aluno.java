/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.Collections;

/**
 *
 * @author JG40
 */
public class Aluno {
    
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    
    @Override
    public String toString(){
        return "[Aluno: " + this.nome + ",   Matricula: " + this.numeroMatricula + "]";
    }    
    
    @Override
    public boolean equals(Object obj){
        Aluno outro = (Aluno) obj;
        return this.nome.equals(outro.nome);
    }
    
    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }
    
}
