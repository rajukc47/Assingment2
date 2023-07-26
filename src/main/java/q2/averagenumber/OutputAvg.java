package q2.averagenumber;

import java.util.Scanner;

public class OutputAvg {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Num : ");

        int a = scan.nextInt();

        System.out.println("Enter Second Num : ");

        int b = scan.nextInt();

        System.out.println("Enter Third Num : ");

        int c = scan.nextInt();

        Average avg = new Average();

        System.out.println("Average of three num is : " + avg.calculateAvg(a , b , c));
    }
}
