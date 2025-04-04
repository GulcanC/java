import java.util.Scanner;

public class FactorialEx2 {
    public static void main(String[] args) {
        //////////////////////////// Write a program to find the factorial value of any number
///  my solution
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter a positive number :");
        int number = myNumber.nextInt();
        for(int i = number; i>1; i--) {
            number = number*(i-1);
        }
        System.out.println(number);


        //// SECOND SOLUTION

        Scanner myNumber2 = new Scanner(System.in);
        System.out.println(("Enter a digit for factorial : "));
        int number2 = myNumber2.nextInt();
        int factorial =1;
        for(int i=1; i<=number2; i++) {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}

// number = 5 => i=5 => 5*4 = 20
// number = 20 => i=4 => 20*3 = 60
// number = 60 => i=3 => 60*2 =120
// number =120 => i=2 = > 120*1 =120