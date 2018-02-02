/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.java1.aula5;

import alura.java1.aula3.Data;

/**
 *
 * @author JG40
 */
public class Funcionario {
    
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada = new Data();
    private String RG;

    private static int identificado=0;
    
    public  Funcionario(String nome){
        this.nome = nome;
        Funcionario.identificado++;
    }
    
    public Funcionario(){  
        this.identificado++;
    }
    
    public static int getIdentificador(){
        return Funcionario.identificado;
    }
    
    void recebeAumento(double aumento){
        salario += aumento;
    }
    
    public double getGanhoAnual(){
        return this.salario * 12;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }    
    
    void mostra(){
        
        System.out.println("Nome:" + this.nome);
        System.out.println("Departamento:" + this.departamento);
        System.out.println("Salario:" + this.salario);
        System.out.println("RG:" + this.RG);    
    
    }
}
