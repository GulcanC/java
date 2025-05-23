// take user input, import Scanner class from util package

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        // test data
        // input weight in pounds, 452
        // input height in inches, 72
        // output = 61.301591

        // To input a value use Scanner class object, get the input value from system
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a weight in pounds: ");
        System.out.println("Enter a height in inches: ");

        double enterWeight = scn.nextInt();
        double enterHeight = scn.nextInt();

        System.out.println(enterWeight + " " + enterHeight);

        double formula = enterWeight / (Math.pow(enterHeight, 2)) * 703;

        System.out.println(formula);

       if(formula > 50) {
           System.out.println("You are obese!");
       }
       else {
           System.out.println("You are healthy!");
       }


    }}