public class StaticKeyword {
    public static void main(String[] args) {

        Student.change();

        // 7 Inside my main class this is the static void class, I create an object of the class s1 = new Student
        // 8 this is the first, second and third object of the class
        Student obj1 = new Student(01, "Gulcan");
        Student obj2 = new Student(02, "Sedat");
        Student obj3 = new Student(03, "Vedat");
        // 9 display name and roll number of the students by calling display() method

        obj1.display();
        obj2.display();
        obj3.display();
    }
}


// 1 create a class Student
class Student {
    // 2 declare roll number
    int rollno;
    String name;
    static String college = "ITS";
// 3 create a static method to change the college name
    static void change() {
        college = "BBDI";
    }

// 4 declare a constructor for this class Student, for this constructor, I need two parameters; roll number of students and name
// 5 r is roll number and n is name

Student(int r, String n) {
       rollno=r;
       name=n;

}

// 6 create a method display()
    void display() {
        System.out.println("Roll No: " + rollno + " Name: " + name);

    }
}