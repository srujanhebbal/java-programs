public class method_demo {
     

    void method1() {
        System.out.println("Inside Method 1");
        method2();   // Calling method2
    }

    void method2() {
        System.out.println("Inside Method 2");
    }

    public static void main(String[] args) {

        method_demo d = new method_demo();

        d.method1();
    }
}

