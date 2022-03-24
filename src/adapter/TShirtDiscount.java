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
public class TShirtDiscount implements ITShirtAdapter {

    private ICloth ts;
    
    public TShirtDiscount() {
        ts = new TShirt();
    }
    @Override
    public void showPrice() {
        int dis = (int)(ts.getPrice() * 0.7);
        ts.setPrice(dis);
        ts.showPrice();
    }

}
