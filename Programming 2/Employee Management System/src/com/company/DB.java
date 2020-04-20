package com.company;

import java.io.*;

public class DB {
    //f

    //m
    public static void register(String Name, String ID, String DOB) throws IOException {
        //print to DB.txt
        FileWriter wr = new FileWriter("DB.txt", true);
        wr.write(ID + " " + Name + " " + DOB + '\r' + '\n');
        wr.close();

    }//reg

    public static String search(String ID) throws FileNotFoundException {
        return "Hi";
    }
    public void numEmployees () {

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
    }


