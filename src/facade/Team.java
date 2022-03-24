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
public class Team {
    private Developer dev;
    private Accountant acc;
    private Manager mgr;
    
    public Team(String devName, String accName, String mgrName){
        dev = new Developer(devName);
        acc = new Accountant(accName);
        mgr = new Manager(mgrName);
    }
    
    public void showDev(){
        dev.showEmp();
    }
    
    public void showAcc(){
        acc.showEmp();
    }
    
    public void showManager(){
        mgr.showEmp();
    }
}
