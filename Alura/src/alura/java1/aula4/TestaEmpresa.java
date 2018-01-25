/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.java1.aula4;

/**
 *
 * @author JG40
 */
public class TestaEmpresa {
    
    public static void main (String[] args){
    
        FuncionarioEmpresa f1 = new FuncionarioEmpresa();
        FuncionarioEmpresa f2 = new FuncionarioEmpresa();
        FuncionarioEmpresa f3 = new FuncionarioEmpresa();
        FuncionarioEmpresa f4 = new FuncionarioEmpresa();
        
        f1.nome = "Fun1";
        f2.nome = "Fun2";
        f3.nome = "Fun3";
        f4.nome = "Fun4";
                
        Empresa empr = new Empresa();
        empr.funcionarios = new FuncionarioEmpresa[5];
        empr.adicionarFuncionario(f1);
        empr.adicionarFuncionario(f2);
        empr.adicionarFuncionario(f3);
        empr.adicionarFuncionario(f4);
        
         empr.contem(f2);
        
        /*
        empr.funcionarios[0].mostra();
        empr.funcionarios[1].mostra();
        empr.funcionarios[2].mostra();
        empr.funcionarios[3].mostra();
        */
        empr.mostraTodasASInformacoes();
        
   
    }
}
