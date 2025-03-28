
// convert celsius to fah.

// util is a package and, Scanner is class inside util package
import java.util.Scanner;
// class
public class ComputeBodyMassIndex {
    // method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in kg: ");
        double weight = input.nextDouble();
        System.out.println("Input height in m: ");
        double height = input.nextDouble();
        double BMI = weight/(height*height);
        System.out.println( "Your BMI is : "  +  BMI );

        if (BMI<23 & BMI>18.5)
            System.out.println("You are healty !");
        else if (BMI< 18.5)
            System.out.println("You are underweight !");
        else if (BMI< 27.5 & BMI> 23)
            System.out.println("You are overweight !");
        else
            System.out.println("You are OBESE !");
    }

}
