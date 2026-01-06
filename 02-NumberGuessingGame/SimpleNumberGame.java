import java.util.Scanner;
import java.util.Random;

public class SimpleNumberGame {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random. nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 10;
        boolean hasWon = false;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have" + maxAttempts+ "attempts");

        while(attempts < maxAttempts && !hasWon){
            System.out.print("\nAttempt" + (attempts + 1) + "/"+maxAttempts + " - Enter your guess: ");

            int guess = scanner.nextInt();
            attempts++;

            if(guess == secretNumber){
                hasWon = true;
                System.out.println("Correct! You guessed it in "+ attempts + " attempts!");
            } else if(guess < secretNumber){
                System.out.println("Too low! Ty higher");
            } else {
                System.out.println("Too high! Try lower.");
            }
        }
    
    if(!hasWon){
        System.out.println("\n Game Over! The number was: " + secretNumber);
    }
    scanner.close();
    }
}