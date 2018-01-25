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
public class Empresa {
    
    private String nome;
    private String cnpj;
           
    private Funcionario[] funcionarios;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;

    }

    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCNPJ(){
        return this.cnpj;
    }
    
    public void adicionarFuncionario(Funcionario f){
        
        for (int i = 0; i < this.funcionarios.length; i++) {
            
            if (this.funcionarios[i] == null){
                this.funcionarios[i] = f;
                 break;
                
            }else{
                System.out.println("Vazio");
            }
          
        }
        
    }
    
    public Funcionario getFuncionario(int posicao){
        return this.funcionarios[posicao];
    }
        
    
}
    