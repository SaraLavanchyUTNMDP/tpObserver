/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpobserver;

/**
 *
 * @author Lavanchy
 */
public class CarState {
    private float oilLevel = 100;
    private float waterLevel = 100;
    private float tirePresion = 0;

    public CarState(){}
    
    public CarState(float a, float b, float c) {
        this.oilLevel=a;
        this.waterLevel=b;
        this.tirePresion=c;
    }

    @Override
    public String toString() {
        return "Car State: " 
                + "The level of Oil=" + this.oilLevel 
                + "| the Water Level=" + this.waterLevel 
                + "| The Tire Presion=" + this.tirePresion;
    }

    @Override
    protected CarState clone() throws CloneNotSupportedException {
        
         CarState carcito = new CarState(this.oilLevel,this.waterLevel,this.tirePresion);
         return carcito;
    }
    
    
    

    public float getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(float oilLevel) {
        this.oilLevel = oilLevel;
    }

    public float getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(float waterLevel) {
        this.waterLevel = waterLevel;
    }

    public float getTirePresion() {
        return tirePresion;
    }

    public void setTirePresion(float tirePresion) {
        this.tirePresion = tirePresion;
    }
    
}
