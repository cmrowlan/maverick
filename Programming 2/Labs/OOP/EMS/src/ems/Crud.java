/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

/**
 *
 * @author Chase
 */
public class Crud {
    //f
    Db db = new Db();
    
    //m
    public Employee register(Employee emp){
        Employee result = db.register(emp);
        return result;
    }//reg
    
    public void search(int ID){
        db.search(ID);
    }//search
    
    public int numEmployees(){
        int result = db.numEmployees();
        return result;
    }//numEmp
    
    public void listEmployees(){
        db.listEmployees();
    }
    //c
}//class
