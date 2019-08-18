package Zad2;

import java.io.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calc("D:\\Calc.txt", "D:\\CalcResult.txt");
    }

    private static void calc (String pathRead, String pathWrite){
        File fileReader = new File(pathRead);

        File fileWriter = new File(pathWrite);
        try {
            Scanner input = new Scanner(fileReader);
            FileWriter fw = new FileWriter(pathWrite);
            BufferedWriter bw = new BufferedWriter(fw);
            while (input.hasNextLine()){
                String[] line = input.nextLine().split(" ");
                String lineToWrite;
                int a = Integer.parseInt(line[0]);
                int b = Integer.parseInt(line[2]);
                int result = 0;
                switch (line[1]){
                    case "+":
                        result = a + b;
                        lineToWrite = a + " + " + b + " = " + result +"\n";
                        System.out.print(lineToWrite);
                        bw.write(lineToWrite);
                        break;
                    case "-":
                        result = a - b;
                        lineToWrite = a + " - " + b + " = " + result + "\n";
                        System.out.print(lineToWrite);
                        bw.write(lineToWrite);
                        break;
                    case "*":
                        result = a * b;
                        lineToWrite = a + " * " + b + " = " + result +"\n";
                        System.out.print(lineToWrite);
                        bw.write(lineToWrite);
                        break;
                    case "/":
                        result = a / b;
                        lineToWrite = a + " / " + b + " = " + result +"\n";
                        System.out.print(lineToWrite);
                        bw.write(lineToWrite);
                        break;
                }
            }
            input.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
