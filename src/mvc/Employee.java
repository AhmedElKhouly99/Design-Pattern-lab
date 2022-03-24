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
public class Employee {
    private int id;
    private String name;
    private int salary;
    private String role;
    
    public Employee(int id, String name, int salary, String role) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }
    
    
}
