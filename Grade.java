import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections;
public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[10];
        System.out.println("Please enter grades now: ");
        for(int i = 0; i < 6; i++)
            grades[i] = sc.nextInt();
        int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / 5;
        int min = Collections.min(grades[]);  
        System.out.println(average + " " + min);

    }
    


}