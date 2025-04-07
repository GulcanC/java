public class UnderstandObjectClass {
    public static void main(String[] args) {
        // 3 How we can create an object. Create an object of the class Objects. Using this object we call the method print()
        Objects obj1 = new Objects();
        obj1.print();
    }
}

// 1 create a new class
class Objects {
    // 2 create a method
    void print() {
        System.out.println("Hello World!");
    }

}
