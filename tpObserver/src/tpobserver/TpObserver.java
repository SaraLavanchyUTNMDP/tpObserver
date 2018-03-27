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
public class TpObserver {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String flag = "si";
        List<Car> cars = null;
        Observer mechanic = new GreaseMonkey();
        Car littleCar= new Car("Peugeot 206", "DGC 769", 500);
        littleCar.addObserver(mechanic);
        String travelling=littleCar.travel(250);
        System.out.println(travelling);
        travelling=littleCar.travel(100);
        System.out.println(travelling);
        travelling=littleCar.travel(100);
        System.out.println(travelling);
        travelling=littleCar.travel(100);
        System.out.println(travelling);
    
    }
        
    
}
