import java.util.Scanner;

public class FibbonniciSeriesEx4 {
    public static void main(String[] args) {

        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = myNumber.nextInt();

    // initialization
        int i = 0, a=0, b=1;

        while(i<number) {
            System.out.print(a + " , ");
            int total = a + b;
            a = b;
            b = total;
            i++;
        }



    }
}


/// F(0) = 0, F(1) = 1
/// if n>1 => F(n) = F(n-1) + F(n-2)
/// F(0) + F(1) = 0+1 =1
/// n=3 => F(3) = F(2)+ F(1) => F(2) = F(1) + F(0) => F(2)= 1 => F(3)= 1+1 => F(3)=2
/// 0 1 1 2 3 5 8 13 21 34 (34+21=55) (55+34= 89) ....