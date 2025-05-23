// take user input, import Scanner class object from util package

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        // Use Scanner object to get input from the system
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int FirstNumber = scn.nextInt();

        System.out.println("Enter second number : ");
        int SecondNumber = scn.nextInt();

        System.out.println(FirstNumber + " " + SecondNumber);

        // SUM of two integers
        System.out.println(FirstNumber + SecondNumber);
        // Difference of two integers
        System.out.println(SecondNumber-FirstNumber);
        // Average of two integers
        System.out.println((FirstNumber+SecondNumber)/2);
        // Max integer
        System.out.println(Math.max(FirstNumber, SecondNumber));
        // Min integer
        System.out.println(Math.min(FirstNumber, SecondNumber));
        // Distance of two integers
        System.out.println(Math.abs(FirstNumber-SecondNumber));


    }
}
