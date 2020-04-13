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
public class Db {
    //f
    Employee DB[] = new Employee[10]; 
    int counter;
    
    //m
    public Employee register(Employee emp){
        DB[counter] = emp;
        counter++;
        return DB[counter-1];
        
    }//reg
    
    public void search(int ID){
        for (int i = 0; i<DB.length; i++)
            if (DB[i].getID() == ID)
               System.out.println("Employee " + ID + ":" +DB[i].getName()+" " + DB[i].getDOB());
            else break;
      }
       
    public int numEmployees(){
        int result = counter;
        return result;
    }
    public void listEmployees(){
        for (int i = 0; i<DB.length; i++)
            if (DB[i] != null)
                System.out.println(DB[i].getID() + " " +DB[i].getName() + " " +DB[i].getDOB());
            else
                break;
    }       
    }
    
    //c

