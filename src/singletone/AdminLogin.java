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
public class AdminLogin {
    
    /// A system has only one admin can login at time!!
    
    private static AdminLogin admin = new AdminLogin();

    private AdminLogin() {}

    public void login(String username, String password) {
        if(username.equals("admin") && password.equals("admin")){
            System.out.println("Login has done successfully");
        }else{
            System.err.println("Login failed !");
        }
    }
    
    public static AdminLogin getAdmin(){
        return admin;
    }
    
}
