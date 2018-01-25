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
public class Data {
    int dia;
    int mes;
    int ano;
    
    void preencheData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String formataData(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
