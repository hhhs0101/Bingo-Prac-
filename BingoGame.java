import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BingoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for Bingo card generation method
        System.out.println("Choose Bingo card generation method:");
        System.out.println("1. Random Bingo card");
        int choice = scanner.nextInt();

        BingoCardCreator cardCreator;

        if (choice == 1) {
            cardCreator = new RandomBingoCardCreator(1, 75);
        } else {
            System.out.println("Invalid option.");
            return;
        }

        // Create Bingo card
        BingoCard bingoCard = cardCreator.createBingoCard();
        System.out.println("Generated Bingo Card:");
        System.out.println(bingoCard);

        // Sample marking
        System.out.println("Enter numbers to mark (enter -1 to stop):");
        int number;
        while ((number = scanner.nextInt()) != -1) {
            bingoCard.markNumber(number);
        }

        // Check for Bingo
        List<BingoRule> rules = new ArrayList<>();
        rules.add(new HorizontalBingoRule());
        rules.add(new VerticalBingoRule());
        rules.add(new FullCardBingoRule());

        BingoChecker checker = new BingoChecker(rules);
        checker.checkForBingo(bingoCard);
    }
}
