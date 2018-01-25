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
public class Empresa {
    
    String nome;
    String cnpj;
    FuncionarioEmpresa[] funcionarios;
    
    void adicionarFuncionario(FuncionarioEmpresa f){
        
        for (int i = 0; i < this.funcionarios.length; i++) {
            
            if (this.funcionarios[i] == null){
                this.funcionarios[i] = f;
                 break;
                
            }else{
                System.out.println("Vazio");
            }
          
        }
        
    }
    
    
    void mostraTodasASInformacoes(){
        
        for (FuncionarioEmpresa funcionario : this.funcionarios) {
            if (funcionario != null) {
                funcionario.mostra();
          
            }
        }
    }
    
    boolean contem(FuncionarioEmpresa f){
        boolean b = false;
        for (FuncionarioEmpresa funcionario : this.funcionarios) {
            if (funcionario.nome.equals(f.nome)) {
                funcionario.mostra();
                b = true;
                break;
            }else{
                b = false;
            }
        }
        return b;
    }
    
}
    

