package q4.accountbalance;

public class Account {
    public String accName;

    public String accNumber;
    public float balance;

    public Account(){

        balance=10000.0f;
    }

    public Account(String accName, String accNumber){

        this.accName = accName;
        this.accNumber = accNumber;
    }

    public void withdraw(float amt){

        if(balance>0 && amt<=balance){

            balance -= amt;

            System.out.println("Withdraw Successful. Remaining balance is : " + balance);

        }
        else {
            System.out.println("Sorry, You don't have sufficient balance to withdraw.");
        }
    }

    public void deposit(float amt){

        balance += amt;

        System.out.println("Deposit successful. Your new balance is : " + balance);
    }
}
