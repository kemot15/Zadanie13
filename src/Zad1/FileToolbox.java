package Zad1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileToolbox {
    public static void fileReader (String path){
        File file = new File(path);
        String[] plik;
        int i = 0;
        try {
            FileReader fr = new FileReader(file);
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(fr);
            while ((line = bufferedReader.readLine()) != null){
                plik[i] = new String(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("nie znaleziono pliku");
        }

    }
}
