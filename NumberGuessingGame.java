import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int secretNumber;
        int userGuess;
        int attempts;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            attempts = 0;
            System.out.println("I have chosen a number between " + minRange + " and " + maxRange + ". Can you guess it?");

            while (true) {
                System.out.print("\nEnter your guess: ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly!");
                    System.out.println("It took you " + attempts + " attempts.");
                    score += attempts;
                    break;
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String playChoice = scanner.next().toLowerCase();
            if (!playChoice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nGame Over! Your total score is: " + score + " attempts.");

        scanner.close();
    }
}
