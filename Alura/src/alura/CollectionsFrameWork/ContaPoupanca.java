/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.CollectionsFrameWork;

/**
 *
 * @author JG40
 */
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{


    @Override
    public int compareTo(ContaPoupanca outra){
        return this.getNumero() - outra.getNumero();
    }

    @Override
    public String toString(){
        return this.getNumero()+"";
    }
    
}
