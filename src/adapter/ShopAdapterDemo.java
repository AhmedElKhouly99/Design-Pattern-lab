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
public class ShopAdapterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICloth beforDisc = new TShirt();
        ITShirtAdapter afterDisc = new TShirtDiscount();
        afterDisc.showPrice();
    }
    
}
