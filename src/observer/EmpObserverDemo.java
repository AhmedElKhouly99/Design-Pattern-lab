/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author ahmed
 */
public class EmpObserverDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee(1, "Ahmed ElKhouly", 20000, "SW Engineer");
        Observer team1 = new Team("Cloud", 13);/// emp is joining team1
        team1.addMember(emp);
        
        Observer dep1 = new Department("IS", 177);/// emp is joining dep1
        dep1.addMember(emp);
        emp.notifyAllObservers();/// Incrementing number of employees
        
    }
    
}
