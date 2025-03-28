import java.util.Scanner;
public class ConvertMinutesToDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double minutesForOneYear= 60*24*365;
        System.out.println("Input the number of minutes:");
     double min = input.nextDouble();

    long years = (long) (min/minutesForOneYear);
    int days = (int) (min/60/24)%365;

        System.out.println((int) min + " minutes is approximately " + years + " years" + " and " + days + " days" );

    }
}
