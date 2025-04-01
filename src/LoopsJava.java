public class LoopsJava {
    public static void main(String[] args) {

        //////////////////// FOR LOOP
        for (int i = -2; i <= 8; i++) {
            System.out.println(i);
        }
        ///////////////////// NESTED FOR LOOP

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        ////////////////////////// WHILE LOOP

        int a = 39;
        while (a <= 45) {
            System.out.println(a);
            a++;
        }

        ////////////////////////// INFINITIVE LOOP

     /* while(true) {
            System.out.println("Infinitive loop");
        } */

        //////////////////////// DO WHILE LOOP

        int r = 1;
        do {
            System.out.println(r);
            r++;
        } while (r < 9);


        //////////////////////////

        int i = 0;
        do {System.out.println("hello");
        i++;
        }
        while(i<=0);
}}
