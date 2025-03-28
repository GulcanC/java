import java.util.Scanner;

public class BreakInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter six non negative digits:");
        int inputNumber = input.nextInt(); // 123456
        int n1 = inputNumber/100000%10; // 1
        System.out.println(n1);
        int n2 = inputNumber/10000%10; // 2
        System.out.println(n2);
        int n3 = inputNumber/1000%10;
        System.out.println(n3);
        int n4 = inputNumber/100%10;
        System.out.println(n4);
        int n5 = inputNumber/10%10;
        System.out.println(n5);
        int n6 = inputNumber%10;
        System.out.println(n6);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 );

    }
}
