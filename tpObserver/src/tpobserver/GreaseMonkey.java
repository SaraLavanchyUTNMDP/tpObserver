/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpobserver;

import java.util.*;


/**
 *
 * @author Lavanchy
 */
public class GreaseMonkey implements Observer {

    @Override
    public void update(Observable observable, Object args) {
        if(args instanceof CarState ){
            System.out.println("El estado anterior del auto era: "+args.toString());
        }
        if(observable != null ){
            if(observable instanceof Car ){
                Car cars = (Car) observable;
                CarState state = cars.getState();
                System.out.println("El estado actual del auto es: "+state.toString());
                
                if(state.getOilLevel()<30){
                    System.out.println("Su aceite esta a menos del 30%!! Debe recargarlo urgente!");
                } else{
                    System.out.println("Su aceite esta al "+state.getOilLevel()
                            +"% considere recargarlo en la brevedad");
                }
                if(state.getWaterLevel()<30){
                    System.out.println("Su agua esta a menos del 30%!! Debe recargarlo urgente!");
                } else{
                    System.out.println("Su agua esta al "+state.getWaterLevel()
                            +"% considere recargarlo en la brevedad");
                }
            }
        }
      
        
    }
    
}
