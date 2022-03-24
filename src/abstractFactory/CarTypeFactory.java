/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

/**
 *
 * @author ahmed
 */
public class CarTypeFactory extends CarAbstractFactory{

    @Override
    ICar getCar(String car) {
        if(car.equals("sedan")){
            return new Sedan();
        }else if(car.equals("suv")){
            return new SUV();
        }
        return null;
    }
    
}
