// GUESSING GAME

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to this app!");

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name );

        System.out.println("Should we start the game?");
        Scanner scanner1 = new Scanner(System.in);
        String answer = scanner1.next();

        if (Objects.equals(answer, "yes")) {
            Random random = new Random();

            Scanner scanner2 = new Scanner(System.in);

            int timesTried = 0;
            
            while (answer.equals("yes")) {
                System.out.println("What is your guess?");
                int userGuess = scanner2.nextInt();
                int randomGuess = random.nextInt(100) + 1;

                if (userGuess == randomGuess) {
                    System.out.println("Random guess is: " + randomGuess + ". Congratulations");
                    break;
                }

                else {
                    timesTried++;
                    if (timesTried <5){
                        System.out.println("Random guess is: " + randomGuess);
                        System.out.println("Guess higher or lower");
                    }

                    else{
                        System.out.println("Game over");
                        break;
                    }
                 }



            }
        }
    }
}

