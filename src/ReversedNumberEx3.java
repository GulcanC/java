import java.util.Scanner;

public class ReversedNumberEx3 {
    public static void main(String[] args) {
        ///  reversed the string or intege
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter a number with 5 digits : ");

        int number = myNumber.nextInt();
        ///  handle negative numbers
        int absNumber = Math.abs(number);

        // initialize reversed to 0
        int reversed =0;

        while(absNumber >0) {
            // extracts the last digit of absNumber
            int lastDigit = absNumber%10; // for example 1234%10 => 4
            reversed = reversed * 10 + lastDigit; // 0 * 10 + 4 => 4
            absNumber /= 10;  // absNumber = absNumber/10 => removes the last digit from absNumber 1234/10 = 123
        }

        System.out.println(number >= 0 ? reversed : -reversed);

    }
}


/// iteration 1 reversed 4, abs number 123
/// iteration 2 => 123%10=3 => lastDigit = 3, reversed = 4*10 + 3 => reversed 43, 123/10= 12 => absNumber = 12
/// iteration 3 => lastDigit = 12%10 => lastDigit = 2,  reversed = 43*10 + 2 = 432, 12/10 => absNumber = 1
/// itearation 4 =>lastDigit = 1%10 => lastDigit = 1, reversed = 432*10+1 = 4321, absNumber => 1/10 = 0 it is not geater than 0 so we stop here

