/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author ahmed
 */
public class Developer implements Employee{
    private final String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void showEmp() {
        System.out.println(this.name+" is a developer.");
    }
    
}
