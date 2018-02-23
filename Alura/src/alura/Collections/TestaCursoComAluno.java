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
public class TestaCursoComAluno {
    public static void main(String[] args) {
        
        
        Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
                
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylilst",20));
        javaColecoes.adiciona(new Aula("Criando uma aula",21));
        javaColecoes.adiciona(new Aula("Modelando com coleções",24));
        
        Aluno a1 = new Aluno("Rodrigo Turini",34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
      
         javaColecoes.matricula(a1);
         javaColecoes.matricula(a2);
         javaColecoes.matricula(a3);
      
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });
        
        System.out.println("O aluno "+ a1 + " esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        
        Aluno turini = new Aluno("Rodrigo Turini",34672);
        System.out.println("E esse turini, esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));
        
        System.out.println("O a1 é equals ao Turini");
        System.out.println(a1.equals(turini));
        
        
        System.out.println(a1.hashCode() == turini.hashCode());
        
        
    }
            
    
}
