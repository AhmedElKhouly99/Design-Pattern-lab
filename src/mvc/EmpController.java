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
public class EmpController {
    private Employee emp;
    private EmpView view;

    public EmpController(Employee emp) {
        this.emp = emp;
        this.view = new EmpView(emp);
    }
    
    public void setEmpId(int id) {
        emp.setId(id);
    }

    public void setEmpName(String name) {
        emp.setName(name);
    }

    public void setEmpSalary(int salary) {
        emp.setSalary(salary);
    }

    public void setEmpRole(String role) {
        emp.setRole(role);
    }

    public int getEmpId() {
        return emp.getId();
    }

    public String getEmpName() {
        return emp.getName();
    }

    public int getEmpSalary() {
        return emp.getSalary();
    }

    public String getEmpRole() {
        return emp.getRole();
    }
    
    public void showEmpData(){
        view.displayEmp();
    }
}
