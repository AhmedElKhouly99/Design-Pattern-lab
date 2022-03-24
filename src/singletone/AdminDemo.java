/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

/**
 *
 * @author ahmed
 */
public class AdminDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdminLogin admin = AdminLogin.getAdmin();
        admin.login("admin", "admin");
        
        admin.login("admin", "anything");
    }
    
}
