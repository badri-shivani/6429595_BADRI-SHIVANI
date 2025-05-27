import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for two numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Prompt for operation
        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
                result = 0; // to avoid compilation error
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
