package Java.Lab07;
public class Bounds{ 
    public static void main(String args[]) { 
            int [] bills = new int [5]; 
    try {        
        for (int i = 0; i < 7; i++)
        System.out.println ("Result = " + bills [i]);
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Array is out of bounds");
    }
     
    }
}
