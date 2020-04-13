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
public class Employee {
    //f
    private int id;
    private String name;
    private String DOB;
    
    
    //m
    public int getID(){
        
        return id;
    }//getID
    public String getName(){
        
        return name;
    }//getName
    public String getDOB(){
     
        return DOB;
    }
    
    
    //c
    Employee(int id, String name, String DOB){
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        
    }//c
    public String toString(Employee emp){
        return "Employee id = " + id + " Name = " + name + " DOB: " + DOB;
    }
}//class
