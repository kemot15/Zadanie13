package Zad3;

import Zad1.FileToolbox;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Code {
    public static void encryption (String path, int move){
        File file = new File(path);
        try {
             FileReader fr = new FileReader(file);
             String line = null;
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine().toUpperCase()) != null) {
                char[] charLine = line.toCharArray();
                //String[]
                for (int i = 0; i < charLine.length; i++) {
                    charLine[i] = (char)((int)charLine[i]+move);
                    System.out.print(charLine[i]);
                    charLine[i] = (char)((int)charLine[i]-move);
                    System.out.println(charLine[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
