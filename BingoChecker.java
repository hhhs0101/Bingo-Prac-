import java.util.Collection;

public class BingoChecker {
    private final Collection<BingoRule> rules;

    public BingoChecker(Collection<BingoRule> rules) {
        this.rules = rules;
    }

    public void checkForBingo(BingoCard card) {
        for (BingoRule rule : rules) {
            if (rule.checkBingo(card)) {
                System.out.println("You have a Bingo of type: " + rule.getRuleName());
            }
        }
    }
}
