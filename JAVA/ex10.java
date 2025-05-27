import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1; // 1 to 100
        int guess;

        System.out.println("Guess the number (between 1 and 100):");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        } while (guess != target);

        scanner.close();
    }
}
