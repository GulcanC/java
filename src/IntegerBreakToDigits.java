// take user input, import Scanner class object from util package

import java.util.Scanner;

public class IntegerBreakToDigits {
    public static void main(String[] args) {
        // test data
        // six non-negative digits : 123456
        // expected output : 1 2 3 4 5 6
        // to input a value use Scanner class object, get input value from system

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a digit with 6 numbers: ");
        int EnteredDigit = scn.nextInt();
        System.out.println(EnteredDigit);

        int n1 = EnteredDigit/100000%10; // => 123456/100000 = 1 => 1/10 = 0
        int n2 = EnteredDigit/10000%10; // => 123456/10000 = 12 => 12/ 10 = 1
        int n3 = EnteredDigit/1000%10; // => 123456/1000 = 123 => 123/10 = 12
        int n4 = EnteredDigit/100%10; // => 123456/100 = 1234 => 1234/10 = 123
        int n5 = EnteredDigit/10%10; // => 123456/10 = 12345 => 12345/10 = 1234
        int n6 = EnteredDigit%10; // 123456/10 = 12345

        System.out.println(n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " +  n5 + ", " +  n6);





    }
}
