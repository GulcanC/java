package BancApp;

// 1 welcome message to user
// 2 deposit
// 3 withdraw
// 4 get previous transaction
// 5 show menu
// 6 execute our code

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 30) we will create object of BankAccount class here, it needs two paramteres cname and cid
        BankAccount bank1 = new BankAccount("Gulcan", "COS");
        // 31) then we call showMenu() method here
        bank1.showMenu();
    }
}

// 1) create another class

class BankAccount {
// 2) create a variable balance, we will update this value
// 3) we create another variable "previousTransaction" which will hold the value and the information about transaction that happened
// balance = bakiye => bir hesapta bulunan para. deposit = yatirim/mevduat => bir hesaba para ekleme isidir

int balance;
int previousTransaction;
// 19) Create a string for customer inf. I will print the customerName and customerId
String customerName;
// 20) We need also customerId
String getCustomerId;
// 21) java is an object oriented language, we have object and constructor. Constructor will automatically called whenever the object of the class is created
// The name of the constructor is class name BankAccount which accepts two parameters cname, cid (c=customer)

    BankAccount(String cname, String cid) {
// 22)  Whenever the object of class was created, the constructor get automatically called. Then we assign the customer name as cname and customerId as cid
    customerName = cname;
    getCustomerId = cid;

    }

// 4) create a method deposit which does not return anything because of that we wrote "void", this method accepts a parameter amount
// 5) we will call this method again and again to perform tasks
void deposit(int amount) {
// 6) if I want to deposit money, I have to check he amount which is given by the user. So check it if our amount is equal to zero
if(amount !=0) {
    // 7) if the amount is zero, you have to update my balance
    balance = balance + amount;
    // 8) I will update also my previous transaction
    previousTransaction = amount;
        }
    }
// 9) create another method for withdraw functionality.
// 10) for withdraw, I need an amount of money to withdraw from my account, so amount is parameter
void withdraw(int amount){
    if(amount !=0) {
// 11) if the amount is 0, we will update the balance and previousTransaction
        balance = balance - amount;
        previousTransaction = -amount;
    }
}

// 12) create another transaction to get previousTransaction.
    void getPreviousTransaction() {
// 13) if previousTransaction value is greater than 0, we will display deposit value, else we will display the withdraw value
        if(previousTransaction>0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction<0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction)); // use abs to not get negatif values
        }
        else {System.out.println("No transaction is occured!");

        }
    }

    // 14) crate method to show menu. Thi is the main method which will hold all functionality of our application..
    // 15) It will call all methods which created before

    void showMenu() {
// 16) declare a charcter "option" initiallt it represents '\0' means NULL
        char option = '\0';
// 17) import Scanner here
        Scanner inputX = new Scanner(System.in);
        // 18) write out the customer inf and welcome message. For doing this create a String inside BankAccount class
        System.out.println((" ******* Welcome " + customerName));
        System.out.println((" ******* Your id is " + getCustomerId));
        // 23) put a new line
        System.out.println();
        // 24) we have some options => A,B,C,D,E
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        // 25) Each time we can't click to run button so we will create a while loop
        do {
            System.out.println("============================");
            System.out.println("Enter the option");
            System.out.println("============================");
            // 26) user charAt(0) method to take first letter of option, for example A. Check Balance=> We will take just A

            option = inputX.next().charAt(0);
            // If user enter a, b, c, d it will give error, so we have to convert option an UpperCase
            Character.toUpperCase(option);
            // 27) next use switch case method, take parameter as option

            switch (option) {
                case 'A':
                    System.out.println("==================================");
                    System.out.println("Balance is : " + balance);
                    System.out.println("==================================");
                    System.out.println();
                    break;

                case 'B':
                    System.out.println("==================================");
                    System.out.println("Enter the amount to deposit : ");
                    System.out.println("==================================");
                    int amount = inputX.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case 'C':
                    System.out.println("==================================");
                    System.out.println("Enter the amount to withdraw" );
                    System.out.println("==================================");
                    int amountWithdraw = inputX.nextInt();
                    withdraw(amountWithdraw);
                    System.out.println();
                    break;

                case 'D':
                    System.out.println("==================================");
                    // 28) call previous transaction
                    getPreviousTransaction();
                    System.out.println("==================================");
                    System.out.println();
                    break;

                case 'E':
                    System.out.println("==================================");
                    break;

                    // 29) create a default case
                default :
                    System.out.println("Invalid option, please try again !");
                    break;
            }
        } while (option != 'E');
    }
}
