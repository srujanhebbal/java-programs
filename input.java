import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            String name = Sc.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }

    
}
