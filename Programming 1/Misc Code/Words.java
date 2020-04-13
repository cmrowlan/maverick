import java.util.Scanner;

public class Words{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your sentence now: ");
        String input = scan.nextLine();
        System.out.println ("Your sentence had " + countWords(input) + " words in it. Thanks!");
    }

    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
          return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
  }
}