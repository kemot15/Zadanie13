package Zad3;

import Zad1.FileToolbox;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Code {
    public static void encryption (String path, int move){
        File file = new File(path);
        if (move >=0)
            --move;
        else
            ++move;
        try {
             FileReader fr = new FileReader(file);
             String line = null;
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                char[] charLine = line.toUpperCase().toCharArray();
                for (int i = 0; i < (charLine.length); i++) {
                    int charInt = (char)((int)charLine[i]);
                    switch (charInt) {
                        case 32: //','
                        case 44: //'.'
                        case 46: //' '
                            break;
                        //case 260: charInt =
                        default:
                            if (move >= 0) {
                                if (charInt + move > 90)
                                    charInt = (charInt - 24);
                                else
                                    charInt += move;
                            } else {
                                if (charInt + move < 65)
                                    charInt = (charInt + 24);
                                else
                                    charInt += move;
                            }
                    }
                    charLine[i] = (char)charInt;
                    System.out.print(charLine[i]);
                   // System.out.print((int)'Ą');
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
