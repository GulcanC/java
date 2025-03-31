import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// UNARY OPERATOR
        int x=10;
        System.out.println(x++); // 10
        System.out.println(+x); // 11
        System.out.println(++x); // 12

// Arithmatic Ops.
        int a=10;
        int b=20;
        System.out.println(a+b); // 30

        // LEFT SHIFT OPERATOR

        System.out.println(a<<2); // a*(2^2) = a*4 = 40
        System.out.println(a<<3); // a*(2^3) = a*8 = 80
        System.out.println(a<<5); // a*(2^5) = a*32 = 320

        // RIGHT SHIFT OPERATOR

        System.out.println(24>>3); // 24/(2^3) = 24/8 = 3
        System.out.println(64>>4); // 64/(2^4) = 64/16 = 4

        // LOGICAL && and BITWISE &

     int t = 10;
     int y = 5;
     int z = 20;

        System.out.println(t>y && z<t); // true && false  => false
        System.out.println(t>y & z<t); // true && false  => false

// ASSIGNMENT OPERATOR

int k=10;
int l=20;
int m=5;

k+=5; // k = k + 5
l-=5; // l = l - 5
m*=5; // m = m * 5

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);


    }

}
