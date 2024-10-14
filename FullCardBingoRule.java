public class FullCardBingoRule implements BingoRule {
    @Override
    public boolean checkBingo(BingoCard card) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!card.isMarked(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String getRuleName() {
        return "Full Card Bingo";
    }
}
