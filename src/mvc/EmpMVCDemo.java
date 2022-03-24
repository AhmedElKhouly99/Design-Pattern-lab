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
public class EmpMVCDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee(1, "Ahmed ElKhouly", 20000, "SW Engineer");
        EmpController empController = new EmpController(emp);
        empController.showEmpData();
    }
    
}
