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
public class Team extends Observer {
    
    private String name;
    private int teamCounter;
    
    public Team(String name, int teamCounter) {
        this.name = name;
        this.teamCounter = teamCounter;
        this.emp = new Vector<>();
    }
    
    public void addMember(Employee emp){
        this.emp.add(emp);
        emp.addObserver(this);
    }
    
    @Override
    public void update() {
        teamCounter ++;
        System.out.println("Number of team members : "+teamCounter);
    }
}
