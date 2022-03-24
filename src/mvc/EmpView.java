/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author ahmed
 */
public class EmpView {
    Employee emp;

    public EmpView(Employee emp) {
        this.emp = emp;
    }
    
    public void displayEmp(){
        System.out.println("Id : "+emp.getId());
        System.out.println("Name : "+emp.getName());
        System.out.println("Salary : "+emp.getSalary());
        System.out.println("Role : "+emp.getRole());
    }
}
