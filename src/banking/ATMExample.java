package banking;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ATMExample {
    public static void main(String[] args) {
        int balance = 1000, withdraw, deposit;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Automated Teller Machine ");
            System.out.println("Choose 1 fro Withdraw ");
            System.out.println("Choose 2 for Deposit ");
            System.out.println("Choose 3 for Check balance ");
            System.out.println("Choose 4 for Exit ");
            System.out.println("Choose the Operation You Want to Perform : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Enter money to be Withdraw ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw){
                        balance=balance-withdraw;
                        System.out.println("Please Collect Your Money ");
                    }
                    else {
                        System.out.println("Insufficient Balance ");
                    }
                    System.out.println(" ");
                    break;

                case 2 :
                    System.out.println("Enter Money to be Deposite :");
                    deposit =sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your Money Has Been Successfully Deposited");
                    System.out.println(" ");
                    break;

                case 3 :
                    System.out.println("Balance : "+balance);
                    System.out.println(" ");
                    break;

                case 4 :
                    System.exit(0);
            }
        }
    }
}
