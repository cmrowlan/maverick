import java.util.Scanner;
public class Grades{

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter your grade percentage: ");
        int userGrade = Scan.nextInt();
        String finalGrade = null;
        if (userGrade == 95){
            finalGrade = "A";
        }else if (userGrade >= 96){
            finalGrade = "A+";
        }else if (userGrade <= 94 && userGrade >= 90){
            finalGrade = "A-";
        }else if (userGrade >= 86 && userGrade < 90){
            finalGrade = "B+";
        }else if (userGrade == 85){
            finalGrade = "B";
        }else if (userGrade <= 84 && userGrade >= 80){
            finalGrade = "B-";
        }else if (userGrade >= 76 && userGrade < 80){
            finalGrade = "C+";
        }else if (userGrade == 75){
            finalGrade = "C";
        }else if (userGrade <= 74 && userGrade >= 70){
            finalGrade = "C-";
        }else if (userGrade >= 66 && userGrade < 70){
            finalGrade = "D+";
        }else if (userGrade == 65){
            finalGrade = "D";
        }else if (userGrade >= 60 && userGrade <= 64){
            finalGrade = "D-";
        }else finalGrade = "F";


        System.out.println("Your grade is : " + finalGrade);

        
    }
}



