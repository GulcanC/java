import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner inputValues = new Scanner(System.in);


        System.out.println("Enter first integer :");
        int inputFirstDigit = inputValues.nextInt();

        System.out.println("Enter second integer :");
        int inputSecondDigit = inputValues.nextInt();

        System.out.println("Sum of two integers are " + (inputFirstDigit + inputSecondDigit));
        System.out.println("Difference of two integers are " + (inputFirstDigit - inputSecondDigit));
        System.out.println("Product of two integers are " + (inputFirstDigit * inputSecondDigit));
        System.out.println("Average of two integers are " + (inputFirstDigit + inputSecondDigit)/2);
       // System.out.println("Distance of two integers are" + inputFirstDigit - inputSecondDigit);
        if (inputFirstDigit>inputSecondDigit)
        System.out.println("Max is " + inputFirstDigit );
        else
            System.out.println("Min is " + inputFirstDigit );
    }

}
