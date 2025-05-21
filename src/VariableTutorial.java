public class VariableTutorial {
    static int o= 100; // STATIC VARIABLE => This variable is inside the class but outside the main method. This is static variable

    // LOCAL VARIABLE => Create a method and declare a variable inside this method. The method is inside class but outside main method
    // The scope of this variable only limited in this method.
    void method() {
    int n=90;
    }
    public static void main(String[] args) {
    // INSTANCE VARIABLE => Inside the class and inside the main method.
    int data = 50;

    // Addition of two numbers
        System.out.println("The result is: " + o);
      //   System.out.println("The result is: " + n); we can not access local n variable
        System.out.println("The result is: " + data);
    }
}
