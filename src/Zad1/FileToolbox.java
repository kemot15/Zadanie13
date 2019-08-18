package Zad1;

import java.io.*;

public class FileToolbox {
    public FileToolbox(String path) {
    }

    public static Employee[] fileReader (String path){
        File file = new File(path);
        String allInOne = "";
        int i = 0;
        try {
            FileReader fr = new FileReader(file);
            String line = null;
            BufferedReader bufferedReader = new BufferedReader(fr);
            while ((line = bufferedReader.readLine()) != null){
                allInOne +=   line + "/";
                i++;
            }
            bufferedReader.close();
        } catch (NullPointerException | IOException e) {
            System.out.println("nie znaleziono pliku");
        }
        Employee[] employee = new Employee[i];
        String[] transfer = allInOne.split("/");
        for (i = 0; i < transfer.length; i++) {
            String[] empDetails = transfer[i].split(";");
            String name = empDetails[0];
            System.out.println(empDetails[0]);
            employee[i] = new Employee(empDetails[0], empDetails[1], empDetails[2], empDetails[3], Integer.parseInt(empDetails[4]));
        }
        return employee;
    }

    public static double avgPayment (Employee[] employees){
        int i;
        double result = employees[0].getSalary();
        for (i = 1; i < employees.length; i++) {
            result += employees[i].getSalary();
        }
        return result/i;
    }

    public static int employeeCount (Employee[] employees){
        return employees.length;
    }

    public static double maxPayment (Employee[] employees){
        double result = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if(employees[i].getSalary()>result)
                result = employees[i].getSalary();
        }
        return result;
    }

    public static double minPayment (Employee[] employees){
        double result = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if(employees[i].getSalary()<result)
                result = employees[i].getSalary();
        }
        return result;
    }
    //dzialy
//    public static String departmentsQty (Employee[] employees){
//        String departments = null;
//        for (int i = 0; i < employees.length; i++) {
//            departments += employees[i]+ "/";
//            String[] department = departments.split("/");
//            for (int j = 0; j < department.length; j++) {
//                if ()
//
//            }
//        }
//        return departments;
//    }

    public static void saveFile (Employee[] employees){
        try (FileWriter fw = new FileWriter("d:\\wynik.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("srednia wyplata: " + FileToolbox.avgPayment(employees) + "\n");
            bw.write("max wyplata: " + FileToolbox.maxPayment(employees) + "\n");
            bw.write("min wyplata: " + FileToolbox.minPayment(employees) + "\n");
            bw.write("Srednia wyplata: " + FileToolbox.avgPayment(employees) + "\n");
            bw.close();
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}
