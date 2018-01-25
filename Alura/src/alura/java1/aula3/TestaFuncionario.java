/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.java1.aula3;

/**
 *
 * @author JG40
 */
public class TestaFuncionario {
    
    public static void main (String[] args){
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        f1.nome = "Hugo";
        f1.salario = 100;
        f1.dataEntrada.preencheData(10, 12,2012);
        f1.recebeAumento(50+9);
        
        f2 = f1;
        
        f2.nome = "Maria";
        
                if(f1 == f2){
                    System.out.println("iguais");
                }else{
                    System.out.println("diferentes");
                }
        
        
        f1.mostra();
        
        
    }
    
}
