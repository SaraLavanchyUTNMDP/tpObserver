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
public class Car extends Observable {
    private String model;
    private String carKey;
    private float independence;
    private CarState state;

    public Car(String model, String carKey, float independence) {
        this.model = model;
        this.carKey = carKey;
        this.independence = independence;
        this.state = new CarState();
    }
    
    /*this method decrement the values of the state if the car can do the travel*/
    public String travel(float distance){
        String posivilityOfTravel = "you will travel "+distance+" km";
        if( distance < this.independence){
            
            float oilLevel = state.getOilLevel()*this.decrement(distance);
            float tirePresion = state.getTirePresion()+(this.decrement(distance)*100);
            float waterLevel = state.getWaterLevel()*this.decrement(distance);
            this.setCarState(oilLevel, tirePresion, waterLevel);
            this.independence=this.independence-distance;
            
        }else{
            posivilityOfTravel = "you don't have the independence necesary "
                    + "to travel this distance!";
        }
        return posivilityOfTravel;
    }
    
    /*this method returns the porcent of decrement that the car will have in a given distance*/
    public float decrement(float number){
        float result=(((number*100)/this.independence)/100);
        return result;
    }

    /*getters and setters*/
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        setChanged();
        notifyObservers();
        clearChanged();
    }

    public String getCarKey() {
        return carKey;
    }

    public void setCarKey(String carKey) {
        this.carKey = carKey;
        setChanged();
        notifyObservers();
        clearChanged();
    }

    public float getIndependence() {
        return independence;
    }

    public void setIndependence(float independence) {
        this.independence = independence;
        setChanged();
        notifyObservers();
        clearChanged();
    }

    public CarState getState() {
        return state;
    }
    
    public void setCarState(float oil, float presion, float water){
        CarState oldState = null;
        try{
            oldState = this.state.clone();
        }catch(CloneNotSupportedException e){}
        
        this.state.setOilLevel(oil);
        this.state.setTirePresion(presion);
        this.state.setWaterLevel(water);
        
        setChanged();
        notifyObservers(oldState);
        clearChanged();
    }

    @Override
    public String toString() {
        return "The Car's model=" + model 
                + "| The Car's Key=" + carKey 
                + "| The Car's independence=" + independence 
                + "| " + this.state.toString();
    }
    
    
    public void setState(CarState state) {
        this.state = state;
    }
   
}
    
    
    
 

