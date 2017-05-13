/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ead_factorymethod;

/**
 *
 * @author dione
 */
public class PizzaFactory {
     public static Pizza getPizza( String tamanhoPizza ) {
        if( tamanhoPizza == null ) return null;
        else if( tamanhoPizza.equals("Pequena") ) return new PizzaPequena();
        else if( tamanhoPizza.equals("Media") ) return new PizzaMedia();
        else if( tamanhoPizza.equals("Grande") ) return new PizzaGrande();

        else return null;
    }   
}
