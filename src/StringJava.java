public class StringJava {
    private static char[] original;

    public static void main(String[] args) {
        // array of characters
        char[] ch = {'h','e','l','l','o'};

        String s = new String(ch);
        System.out.println(s);

        ////////////////////////////////////////////

        String s2 = new String(ch); // it concatinates the letters inside array
        String s3 = new String( "GulcanCoskun");
        System.out.println(s2);
        System.out.println(s3);

        ////////////////////////////
        String s4 = new String("Gulcan COSKUN");
        System.out.println(s4.toLowerCase());

        ///////////////////////////////////
        System.out.println(s4.toUpperCase());

    }
}
