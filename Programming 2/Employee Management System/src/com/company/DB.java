package com.company;

import java.io.*;
import java.util.Scanner;

public class DB {
    //f
    static int counter = 0;

    //m
         //done
    public static void register(String Name, String ID, String DOB) throws IOException {
        //print to DB.txt
        FileWriter wr = new FileWriter("DB.txt", true);
        wr.write(ID + " " + Name + " " + DOB + '\r' + '\n');
        wr.close();
    }//reg

    public static String search(String ID) throws IOException {
        String input[] = new String[10];
        int cnt = 1;
        //all users are entered as the ID space is needed
        //use text line from .txt to find ID
        int command = Integer.parseInt(ID);
        BufferedReader br = new BufferedReader(new FileReader("DB.txt"));
        while (true){
            String str = br.readLine();
            if (str == null){
                break;
            }
            input[cnt] = str;
            System.out.println(input[cnt]);
            cnt++;
        }
        return input[command];
    }
    public static void listEmployees() throws IOException {
        FileReader reader = new FileReader("DB.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;

        while ((line = bufferedReader.readLine()) != null) {
                ListAll.tam.append(line + '\r' + '\n');
            }
        reader.close();
        }

    public static int count() throws FileNotFoundException {
        Scanner file = new Scanner(new File("DB.txt"));
        while (file.hasNextLine()) {
            counter++;
            file.nextLine();
        }
        return counter;
    }
}



