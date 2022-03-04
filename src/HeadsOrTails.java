import java.util.Scanner;
import java.util.Random;

public class HeadsOrTails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int correctCount = 0;
		
		System.out.println("Heads or tails? ");
		String headsOrTailsGuess = input.nextLine();
		
		System.out.println("How many time should we flip the coin? ");
		int numberOfFlips = input.nextInt();
		
		for (int i = 0; i < numberOfFlips; i++) {
			int coin = random.nextInt(2);
			if (coin == 0) {
				System.out.println("Heads");
				if (headsOrTailsGuess.contains("Heads") || headsOrTailsGuess.contains("heads")) {
					correctCount++;
				}
			} else {
				System.out.println("Tails");
				if (headsOrTailsGuess.contains("Tails") || headsOrTailsGuess.contains("tails")) {
					correctCount++;
				}
			}
		}
		
		System.out.println("You guessed " + headsOrTailsGuess + " and you were right " + correctCount + " times.");
		
		double rate = (double) correctCount / numberOfFlips;
		System.out.println("That's "+ rate*100 + "%");

	}

}
