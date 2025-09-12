import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Jordan", 0);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int maxTurns = 3;
        int currentTurn = 1;
        boolean hasWon = false;

        System.out.println("Welcome " + player.getName() + "!");
        System.out.println("Guess the number between 1 and 10. You have " + maxTurns + " turns.");

        while(currentTurn <= maxTurns && !hasWon){
            System.out.print("Turn " + currentTurn + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if(guess < 1 || guess > 10){
                System.out.println("Please guess a number between 1 and 10.");
                continue;
            }

            if(guess == secretNumber){
                hasWon = true;
                player = new Player(player.getName(), player.getScore() + 10);
                System.out.println("Congratulations " + player.getName() + "! You've guessed the number!");
            } else {
                System.out.println("Wrong guess. Try again.");
                currentTurn++;
            }
        }
    }
}