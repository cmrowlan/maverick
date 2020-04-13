/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;
import java.util.*;

/**
 *
 * @author Chase
 */
public class Ui {
    //f
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    //m
    
    
   //switch case here for 1-5
    //menu
    
    
    public void showMenu(){
        int i = 0;
        Crud cr = new Crud();
        while(i<1){
        System.out.println("Menu---------------");
        System.out.println("1 - Register Employee");
        System.out.println("2 - Search Employee");
        System.out.println("3 - Number of Employees Registered");
        System.out.println("4 - List All Employees");
        System.out.println("5 - Quit Program");
        System.out.println("-------------------");
        System.out.println("Please select an option from above: ");
        String option = sc.nextLine();
         switch(option){
            case "1" : //register
                System.out.println("REGISTRATION------");
                System.out.print("enter id: ");
                int id = sc.nextInt();
                System.out.print("enter name: ");
                String name = sc1.nextLine();
                System.out.println("enter DOB (mm/dd/yy) : ");
                String DOB = sc2.nextLine();
                Employee emp = new Employee(id, name, DOB);
                Employee result = cr.register(emp);
                System.out.println(result.getName() + " was successfully registered!");
                break;
            case "2" : //search
                System.out.println("SEARCH BY ID-------------");
                System.out.println("Enter ID (2 Digits): ");
                int id2 = sc.nextInt();
                cr.search(id2);
                break;
            case "3" : //numEmp
                System.out.println("Total number of employees: " + cr.numEmployees());
                break;
            case "4" : //listEmp
                System.out.println("Employee List: ");
                cr.listEmployees();
                //System.out.println(cr4.listEmployees());
                break;
            case "5" : //quit
                System.exit(0);
                
        }
        
        }
        
    }
}