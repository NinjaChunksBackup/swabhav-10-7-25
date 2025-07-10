import java.util.*;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String playAgain = "yes";
        
        while (playAgain.equals("yes")) {
            int number = r.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean won = false;
            
            System.out.println("Random number generated: " + number);
            System.out.println("Maximum possible attempts -> " + maxAttempts);
            
            while (attempts < maxAttempts && !won) {
                System.out.print("Guess a number? ");
                int guess = sc.nextInt();
                attempts++;
                
                if (guess < number) {
                    System.out.println("Higher");
                } else if (guess > number) {
                    System.out.println("Lower");
                } else {
                    System.out.println("You won: in attempt: " + attempts);
                    won = true;
                }
            }
            
            if (!won) {
                System.out.println("Game over! The number was: " + number);
            }
            
            System.out.print("Do you want to play the game again: yes/ no -> ");
            playAgain = sc.next();
        }
        
        sc.close();
    }
}