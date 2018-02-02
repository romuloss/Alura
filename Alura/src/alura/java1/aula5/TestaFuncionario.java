/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.java1.aula5;

/**
 *
 * @author JG40
 */
public class TestaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario fu = new Funcionario();
        fu.setSalario(5000+5);
        
        System.out.println(Funcionario.getIdentificador());
        
          Funcionario fu1 = new Funcionario();
          
          System.out.println(Funcionario.getIdentificador());
          
           Funcionario fu2 = new Funcionario();
          
          System.out.println(Funcionario.getIdentificador());
          
        
        System.out.println(fu.getSalario() + " " + fu.getGanhoAnual());
        
        
    }
    
}
