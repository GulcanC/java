import java.util.Scanner;
public class ConditionsJava {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int age =40;

        if(age>=40 )
            System.out.println(age + " is an older age ");

            int year = 2025;

            if((year%4 == 1) && (year%100 == 0)) {

                System.out.println("there is no leap");

            }

            else
                System.out.println("there is a leap");

            if ((year >=2015 || year <= 2018)) {

                System.out.println("there is NO ERROR");
            }

        ////////////////////////////////////////////////////////////////////

        Scanner input = new Scanner(System.in);
        System.out.println("Input  grade: ");
        double  grade = input.nextDouble();


            if(grade>=50 && grade<=60)  System.out.println("The grade is C");

            else if(grade>60 && grade<=70)  System.out.println("The grade is B");

            else if(grade>=70 && grade<80)  System.out.println("The grade is A");

            else if( grade>80)  System.out.println("The grade is perfect!");

////////////////////////////////////////////////////////////////// nested if

        Scanner inputAge = new Scanner(System.in);
        System.out.println("Input  age: ");
        double  myAge = input.nextDouble();

        Scanner inputGender = new Scanner(System.in);
        System.out.println("Input  weight: ");
        double weight = input.nextDouble();

        if (myAge > 40) {
            if(weight > 73) {
                System.out.println("The age is " + myAge + " and it is a " + weight + " kilos");
            }
        }





    }
}
