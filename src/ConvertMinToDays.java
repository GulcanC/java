// take user input, import Scanner class from util package
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConvertMinToDays {

    public static void main(String[] args) {
        // Test data
        // input the number of minutes 3456789
        // expected output is 6 years and 210 days

        // to input a value use Scanner class object, get the input value from the system
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a minute value: ");
        // double keyword is a primitive data type that store decimal numbers with a higher degree of precision
        double EnterMinutes = scn.nextInt();

        double MinutesInOneYear = 365*24*60;
        // long key word is used to store large integer values
        long yearsInMyEnteredMinutes = (long) (EnterMinutes/MinutesInOneYear);
        System.out.println("YEARS: " + yearsInMyEnteredMinutes);
        int daysInMyEnteredMinutes = (int) (EnterMinutes/(60*24))%365;
        System.out.println("DAYS: " + daysInMyEnteredMinutes);
    }

}
