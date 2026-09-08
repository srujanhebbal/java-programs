import java.util.Scanner;

public class atm_simulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000.00;
        int enteredPin;

        System.out.println("================================");
        System.out.println("       WELCOME TO ATM");
        System.out.println("================================");

        // PIN Verification
        System.out.print("Enter your PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN!");
            System.out.println("Please try again.");
            sc.close();
            return;
        }

        System.out.println("Login successful!");

        int choice;

        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Amount deposited successfully!");
                        System.out.println("New Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawal = sc.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Invalid withdrawal amount!");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Please collect your cash.");
                        System.out.println("Remaining Balance: ₹" + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}