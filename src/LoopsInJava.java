public class LoopsInJava {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }

        /// println(a) starts from new row

        for(int a=1; a<=10; a++) {
            System.out.println(a);
        }

        ///////////////NESTED LOOP////////////////////

        for (int b=1; b<=5; b++) {
            for (int c=1; c<=b; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        ///////////////// WHILE LOOP ///////////////

        int d=5;
        while(d<=12  && d>3){
            System.out.println(d);
            d++;
        }


        ///////////////// DO-WHILE LOOP ///////////////

        int x=14;
        do {
            System.out.println(x);
            x--;
        }
        while(x>10);

        ///////////////////////////// the difference between do-while lopp and while loop /////////////////////////

        ///  even if the instruction is not correct, do-while loop has to run the statement inside "do" at least 1 time

        ///  for example here the string length is 6, so while loop will not be executed
        String myString = new String("Gulcan");

        while(myString.length() >= 10) {
            System.out.println("The string is greater than 10");
        }

        ///  for example here the string length is 6, s my instruction is not correct, but do-while loop will be executed

        do{
            System.out.println("The string length is 6 but I have to be executed at least one time");
        } while(myString.length()>=10);

    }

}
