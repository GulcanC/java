
import java.util.Scanner;
public class OperatorsJava {
    public static void main(String[] args) {
        // create Scanner object to get input value from system
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int FirstNumber = scn.nextInt();

        System.out.println("Enter second number : ");
        int SecondNumber = scn.nextInt();

        System.out.println(FirstNumber + " " + SecondNumber);

        // Unary operation
        System.out.println(++FirstNumber);
        int x = 10;
        System.out.println(--x);
        // Arithmetic operations
        System.out.println(10+SecondNumber);
        // Left shift operator
        System.out.println(FirstNumber<<3);
        System.out.println(5<<5); // 5*(2^5) => 5*32=160
        // Right shift operator
        System.out.println(22>>3); // 22/(2^3) => 22/8 = 2 => T gives integer not decimal result
        // logical operators =>  && AND, || OR, ! NOT

        int a=10;
        int b=20;
        int c=40;

        System.out.println(a<b && c<a); // TRUE && FALSE => FALSE
        System.out.println(a<b && b<c); // TRUE && TRUE => TRUE

        System.out.println(a<b || c<b); // TRUE || FALSE => TRUE

        System.out.println(a != 10); // FALSE
        System.out.println(a != 23); // TRUE

        // BITWISE OPERATORS => & AND, | OR

        System.out.println(a<b && c<a); // TRUE && FALSE => FALSE
        System.out.println(a<b && b<c); // TRUE && TRUE => TRUE

        System.out.println(a<b || c<b); // TRUE || FALSE => TRUE

        // Assignment operator
        System.out.println(a+=4); // a+4 = 14
        System.out.println(b-=4); // b-4 = 16
        System.out.println(c*=2); // c*2 = 80




    }
}
