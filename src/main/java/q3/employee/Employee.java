package q3.employee;

import java.util.Scanner;

public class Employee {

    float sal , npr;
    public void getInfo(float s, float n){

        this.sal = s;

        this.npr = n;


    }
    public void addSal(){

        if(npr < 3 ){
            sal += 5;
        }
    }

    public void addWork(){
        if(npr > 6 ){

            sal += 10;
        }
    }
    public void printFinalSalary(){
        System.out.println("Final Salary :" + sal);
    }
}
