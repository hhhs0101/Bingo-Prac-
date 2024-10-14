public class VerticalBingoRule implements BingoRule {
    @Override
    public boolean checkBingo(BingoCard card) {
        for (int j = 0; j < 5; j++) {
            boolean hasBingo = true;
            for (int i = 0; i < 5; i++) {
                if (!card.isMarked(i, j)) {
                    hasBingo = false;
                    break;
                }
            }
            if (hasBingo) return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "Vertical Bingo";
    }
}