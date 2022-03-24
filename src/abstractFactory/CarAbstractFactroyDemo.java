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
public class CarAbstractFactroyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarAbstractFactory brand = CarProducer.getCarFactory("brand");
        ICar bmwCar = brand.getCar("bmw");
        bmwCar.buyCar();
        
        CarAbstractFactory type = CarProducer.getCarFactory("type");
        ICar SuvCar = type.getCar("suv");
        SuvCar.buyCar();
    }
    
}
