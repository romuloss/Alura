/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.java1.aula4;

import alura.java1.aula3.Data;

/**
 *
 * @author JG40
 */
public class FuncionarioEmpresa {
    
    String nome;
    String departamento;
    double salario;
    Data dataEntrada = new Data();
    String RG;

    void recebeAumento(double aumento){
        salario += aumento;
    }
    
    double calculaGanhoAnual(){
        return this.salario * 12;
    }
    
    void mostra(){
        
        System.out.println("Nome:" + this.nome);
        System.out.println("Departamento:" + this.departamento);
        System.out.println("Salario:" + this.salario);
        System.out.println("RG:" + this.RG);
        
    }
    
}
