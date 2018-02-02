/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author JG40
 */
public class Teste {
    public static void main(String[] args){
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println(a.calculaArea());
        
        
        AreaCalculavel b = new Circulo(2);
        System.out.println(b.calculaArea());
    }
}
