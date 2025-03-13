package Miniprojects;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount myAccount = new BankAccount("Fred", 123456);
        System.out.println("Testing toString Method" + myAccount);

        System.out.println("\n\nTe s t i ng ge t me t hods ");
        String Name1 = myAccount.getName();
        System.out.println(myAccount.getNum());
        System.out.println(myAccount.checkBalance());

        System.out.println("Input the number you would like to deposit to " + Name1 + "\'s account: ");
        double money1 = scan.nextDouble();
        myAccount.deposit(money1);
        System.out.println(myAccount.checkBalance());

        BankAccount myAccount2 = new BankAccount("Mary", 987654);
        String Name2 = myAccount2.getName();

        System.out.println("Input the number you would like to withdraw from " + Name2 + "\'s account: ");
        double money2 = scan.nextDouble();
        myAccount2.withdraw(money2);
        System.out.println(myAccount2.checkBalance());

        scan.close();

    }
}
