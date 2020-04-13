import java.util.Scanner;

public class Introduction {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
      
        System.out.println("What is your first name?");
        
        String firstName = scan.nextLine();
        
        System.out.println("what is your last name?");

        String lastName = scan.nextLine();

        System.out.println("What grade do you want in this class?");

        String grade1 = scan.nextLine();

        System.out.println("What is your age?");

        int age = scan.nextInt();
       
        System.out.println("My name is " + firstName + " " + lastName + " " + "I am " + age + " and I will get an " + grade1 + " in this class.");

        

    }    
    
}  

