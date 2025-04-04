import java.util.Scanner;

public class TableMultipleEx1 {
    public static void main(String[] args) {

        //////////////////////// write a program to calculate the first 10 number
       int sum = 0;

       for(int i = 1; i<=10; i++) {
           sum = sum +i;
           // sum+ =i
       }
       System.out.println(sum);


       ///////////////////////// write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number
        Scanner inputInteger = new Scanner(System.in);
        int num;
        System.out.println("enter a positive number : ");
        num=inputInteger.nextInt();

        System.out.println("Multiplication table of the number " + num + ":");
        for(int l =1; l<=num; l++) {
            System.out.println(num + " x " + l +" = " + ( num*l));
        }


    }
}
