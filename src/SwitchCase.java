public class SwitchCase {
    public static void main(String[] args) {
        int number = 10;
        switch(number) {
            case 10:
               System.out.println("The number is 10");
               break;
            case 0:
                System.out.println("The number is 0");
                break;
            default:
                System.out.println("There is no number");
        }


        int number2 = 1;
        switch(number2) {
            case 20:
                System.out.println("The number is smaller than 25");
                break;
            case 25:
                System.out.println("the number is 25");
                break;
            case 30:
                System.out.println("The number is greater than 25");
                break;
            default:
                System.out.println("The number is 0");
        }
    }
}
