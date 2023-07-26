package q3.employee;

import java.util.Scanner;

public class OutputSalary {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Your Salary : ");

        float s = scan.nextFloat();

        System.out.println("Enter your no of hour work per day");

        float n = scan.nextFloat();

        Employee e = new Employee();

        e.getInfo(s , n);

        e.addSal();

        e.addWork();

        e.printFinalSalary();
    }
}
