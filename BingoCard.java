import java.util.Arrays;

public class BingoCard {

    private int [][] card; 
    private boolean [][] marked;
    private static int SIZE = 5;

    public BingoCard(int[][] cardNumber) {

        this.card = cardNumber;
        this.marked = new boolean[SIZE][SIZE];
    }

    public void markNumber(int number) {

        for(int n = 0; n < SIZE; n++) { 
            for(int i = 0; i < SIZE; i++) {

                if(card[n][i] == number) {
                    marked[n][i] = true;
                
                }

            }

        }

    }

    public boolean isMarked(int row, int col) {
        return marked[row][col];
    }

    public int[][] getCard() {
        return card;
    }

    public boolean[][] getMarked() {
        return marked;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++ ) {
            sb.append(Arrays.toString(card[i])).append("\n");
        }
        return sb.toString();
    }
}

 