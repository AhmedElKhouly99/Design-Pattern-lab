/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author ahmed
 */
public class TShirt implements ICloth {
    private int price = 100;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("TShirt price : "+this.price+"$");
    }
    
}
