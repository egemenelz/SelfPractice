package MuhtarOnly.EmployeesInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();

        employee1.setInfo("Egemen", 'M', 112345677, "16655788", "SDET", "Cybertek", 120000);
        employee2.setInfo("Volkan", 'M', 59955789,"38536746","SDET", "Tesla", 150000);
        employee3.setInfo("Cihat", 'M', 63538908, "12343654","QA", "NASA", 200000);
        employee4.setInfo("Ayelet", 'F', 86476537, "12425355", "Video Editor", "CSP Media", 60000);
        employee5.setInfo("Steph", 'F', 1235321, "23539634","Photographer","CSP Meadia", 50000);

        employee4.getInfo();
        employee1.getInfo();

        System.out.println("=======================");

        ArrayList<Employees> listOfEmployee = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5));
        listOfEmployee.removeIf(p -> p.salary < 100000);
        for (Employees eachEmployee : listOfEmployee){
            eachEmployee.getInfo();
        }

    }
}
