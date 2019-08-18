package Zad1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = FileToolbox.fileReader("D:\\test.txt");
//        for (Employee emp: employee) {
//            System.out.println(emp.toString());
//        }
//        System.out.println("srednia wyplata: " + FileToolbox.avgPayment(employee));
//        System.out.println("min wyplata: " + FileToolbox.minPayment(employee));
//        System.out.println("Max wyplata: " + FileToolbox.maxPayment(employee));
//        System.out.println("Ilosc pracownikow: " + FileToolbox.employeeCount(employee));
        FileToolbox.saveFile(employee);
    }
}
