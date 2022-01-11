import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Operations operations = new Operations();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select operation to perform");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.println("7. Modulus");
        System.out.println("8. Absolute Value");
        System.out.println("9. Exit");
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        switch (choice) {
            case 1:
                System.out.println("Enter numbers to add");
                int sum = operations.sum(scanner.nextInt(), scanner.nextInt());
                System.out.println("Sum = " + sum);
                break;
            case 2:
                System.out.println("Enter numbers to subtract");
                int sub = operations.subtract(scanner.nextInt(), scanner.nextInt());
                System.out.println("Subtract = " + sub);
                break;
            case 3:
                System.out.println("Enter numbers to multiply");
                int mul = operations.multiply(scanner.nextInt(), scanner.nextInt());
                System.out.println("Multiply = " + mul);
                break;
            case 4:
                System.out.println("Enter numbers to divide");
                double div = operations.divide(scanner.nextInt(), scanner.nextInt());
                System.out.println("Divide = " + div);
                break;
            case 5:
                System.out.println("Enter numbers to power");
                int pow = operations.power(scanner.nextInt(), scanner.nextInt());
                System.out.println("Power = " + pow);
                break;
            case 6:
                System.out.println("Enter numbers to square root");
                double sqrt = operations.squareRoot(scanner.nextInt());
                System.out.println("Square Root = " + sqrt);
                break;
            case 7:
                System.out.println("Enter numbers to modulus");
                int mod = operations.modulus(scanner.nextInt(), scanner.nextInt());
                System.out.println("Modulus = " + mod);
                break;
            case 8:
                System.out.println("Enter numbers to absolute value");
                int abs = operations.absoluteValue(scanner.nextInt());
                System.out.println("Absolute Value = " + abs);
                break;
            case 9:
                System.out.println("Exiting");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice");
                break;

        }
        scanner.close();
    }

}
