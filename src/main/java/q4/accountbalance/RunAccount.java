package q4.accountbalance;

import java.util.Scanner;

public class RunAccount {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Account acc = new Account();

        System.out.println("Enter Your Account Name :");

        String accName = scanner.nextLine();

        System.out.println("Enter your account number :");

        String accNum = scanner.nextLine();

        System.out.println("Your initial balance is :" + acc.balance);

        System.out.println("Choose 1 : Deposit and 2 : Withdrawn");

        int choice = scanner.nextInt();

        System.out.println("Enter Amount for Transaction");

        float amt = scanner.nextFloat();

        if(choice==1){
            acc.deposit(amt);
        }


        else if(choice==2){
            acc.withdraw(amt);
        }
        else{
            System.out.println("Invalid Choice");
        }

    }

}
