/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author ahmed
 */
public abstract class CarFactory {
    public static ICar getCar(String type){
        if(type.equals("sedan")){
            return new Sedan();
        }else if(type.equals("suv")){
            return new SUV();
        }
        return null;
    }
}
