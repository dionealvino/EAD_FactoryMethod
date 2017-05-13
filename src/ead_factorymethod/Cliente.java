/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead_factorymethod;

import javax.swing.JOptionPane;

/**
 *
 * @author dione
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String tamanho = JOptionPane.showInputDialog("Tamanho da pizza:");
       Pizza pizza = PizzaFactory.getPizza(tamanho); 
        if( pizza != null ) {   
           System.out.println( "Preço: " + pizza.getPreco() );   
     }   
    }
    
}
