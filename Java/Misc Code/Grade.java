import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[5];
        System.out.println("Please enter grades now: ");
        for(int i = 0; i < 5; i++)
            grades[i] = sc.nextInt();
        int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / grades.length;          
        int max = getMaxValue(grades);
        int min = getMinValue(grades);
        System.out.println("The maximum grade was: " + max + '\n' +
        "The minimum grade was: " + min + '\n' + "The average was: " + average);

    }
    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
          if(numbers[i] < minValue){
            minValue = numbers[i];
          }
        }
        return minValue;
    }
        public static int getMaxValue(int[] numbers){
            int maxValue = numbers[0];
            for(int i=1;i < numbers.length;i++){
              if(numbers[i] > maxValue){
                maxValue = numbers[i];
              }
            }
            return maxValue;
    }
}