import java.util.*;

public class Pig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int total = 0, turn = 0;
        int maxTurns = 5;
        
        while (total < 20 && turn < maxTurns) {
            int score = 0;
            System.out.println("\nTURN " + ++turn);
            
            while (true) {
                System.out.print("Roll or hold? (r/h): ");
                if (sc.next().equals("h")) {
                    total += score;
                    System.out.println("Score for turn: " + score);
                    System.out.println("Total score: " + total);
                    break;
                }
                int die = r.nextInt(6) + 1;
                System.out.println("Die: " + die);
                if (die == 1) {
                    System.out.println("Turn over. No score.");
                    break;
                }
                score += die;
            }
        }
        
        if (total >= 20) {
            System.out.println("\nYou finished in " + turn + " turns!\nGame over!");
        } else {
            System.out.println("\nGame over! You ran out of turns.");
            System.out.println("Final score: " + total);
        }
        sc.close();
    }
}