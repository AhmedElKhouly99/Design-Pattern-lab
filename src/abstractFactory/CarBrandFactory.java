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
public class CarBrandFactory extends CarAbstractFactory{

    @Override
    ICar getCar(String car) {
        if(car.equals("bmw")){
            return new BMW();
        }else if(car.equals("mersedes")){
            return new Mercedes();
        }
        return null;
    }
    
}
