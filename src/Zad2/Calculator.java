package Zad2;

import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            calc("G:\\Calc.txt", "G:\\CalcResult.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void calc (String pathRead, String pathWrite) throws IOException {
        File fileReader = new File(pathRead);
            Scanner input = new Scanner(fileReader);
            FileWriter fw = new FileWriter(pathWrite);
            BufferedWriter bw = new BufferedWriter(fw);
            while (input.hasNextLine()){
                String[] line = input.nextLine().split(" ");
                String lineToWrite = null;
                int a = Integer.parseInt(line[0]);
                int b = Integer.parseInt(line[2]);
                lineToWrite = a + " " + line[1] + " " + b + " = " + getResult(line[1], a, b) +"\n";
                System.out.print(lineToWrite);
                bw.write(lineToWrite);
            }
            input.close();
            bw.close();
    }

    private static int getResult (String sign, int a, int b){
        switch (sign){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
                default:
                    return 0;
        }

    }

}
