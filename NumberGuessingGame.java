import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    int numberToGuess = rand.nextInt(100) + 1;
    int attempts = 0;
    int guess = 0;
    boolean guessedCorrectly = false;
    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have selected a number between 1 and 100. Try to guess it!");
    
    while(!guessedCorrectly){
        System.out.println("Enter your guess:");

        if(!scanner.hasNextInt()){
            System.out.println("Please enter a valid number");
            scanner.next();
            continue;
        }
  
            guess = scanner.nextInt();
            attempts++;

            if(guess<numberToGuess){
                System.out.println("Too low try again");

            }
            else if(guess>numberToGuess){
                System.out.println("Too high ! try again");
            
            }
            else{
                guessedCorrectly = true;
                System.out.println("Congratulations you have guessed the correct number");
            }
        }
        scanner.close();
    }

  }