public class HorizontalBingoRule implements BingoRule {
    @Override
    public boolean checkBingo(BingoCard card) {
        for (int i = 0; i < 5; i++) {
            boolean hasBingo = true;
            for (int j = 0; j < 5; j++) {
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
        return "Horizontal Bingo";
    }
}



