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
public class CarProducer {
    public static CarAbstractFactory getCarFactory(String option) {
        if(option.equals("brand")){
            return new CarBrandFactory();
        }else if(option.equals("type")){
            return new CarTypeFactory();
        }
        return null;
    }
}
