/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Vector;

/**
 *
 * @author ahmed
 */
public class Department extends Observer {
    private String name;
    private int depCounter;
    
    public Department(String name, int depCounter) {
        this.name = name;
        this.depCounter = depCounter;
        this.emp = new Vector<>();
    }
    
    public void addMember(Employee emp){
        this.emp.add(emp);
        emp.addObserver(this);
    }
    
    @Override
    public void update() {
        depCounter ++;
        System.out.println("Number of team members : "+depCounter);
    }
}
