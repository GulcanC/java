// taking user input, import Scanner class from util package
import java.util.Scanner;

public class ConvertTempFahToCel {
    public static void main(String[] args) {
        // test data
        // input a degree in Fahrenheit :212
        // output
        // formula : C= (F-32) / 1.8

     // To input a value use Scanner class object
        // scn is object name for the Scanner class
        Scanner scn = new Scanner(System.in); // get the input value from the system
        System.out.println("Enter a temparature value in Fahrenheit :");
        int Fahrenheit = scn.nextInt();

        // declare a variable for formula Celsius

        double Celsius = (Fahrenheit - 32)/1.8;
        System.out.println("The 212 Fhrenheit is equal to : " + Celsius + " Celsius!");



    }
}

