/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alura.CollectionsFrameWork;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JG40
 */
public class TestaOrdenacao {
    
    
    
    public static void main (String[] args){
    
    List<ContaPoupanca> contas = new LinkedList<>();
    ContaPoupanca c1 = new ContaPoupanca();
    c1.setNumero(3);
    contas.add(c1);
    
    ContaPoupanca c2 = new ContaPoupanca();
    c2.setNumero(6);
    contas.add(c2);
    
    ContaPoupanca c3 = new ContaPoupanca();
    c3.setNumero(1);
    contas.add(c3);
    
    Collections.sort(contas);
    Collections.reverse(contas);
    
    contas.forEach((conta) -> {
        System.out.println(conta);
        });
    
    
    }
}
