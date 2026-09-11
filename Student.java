public class Student {
    String name;  // Instance variable
    static String college = "GM University";  // Static variable
    public static void main(String[] args) {
        // Creating two objects
        Student s1 = new Student();
        Student s2 = new Student();
        // Assigning different names
        s1.name ="Rinu";
        s2.name ="Neha";
        // Displaying instance variables
        System.out.println(s1.name);
        System.out.println(s2.name);
        // Displaying static variable
        System.out.println(Student.college);
    }
}
