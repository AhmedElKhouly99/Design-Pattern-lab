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
public abstract class Observer {
    protected Vector<Employee> emp;
    public abstract void addMember(Employee emp);
    public abstract void update();
}
