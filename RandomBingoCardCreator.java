import java.util.Random;


public class RandomBingoCardCreator implements BingoCardCreator {
    
    private int minNumber;
    private int maxNumber;

    public RandomBingoCardCreator(int minNumber, int maxNumber){
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    @Override
    public BingoCard createBingoCard(){

        int[][] cardNumber = new int[5][5];
        Random ran = new Random();

        for (int i = 0; i < 5; i++){
            for (int n = 0; n < 5; n++){
                cardNumber[i][n] = ran.nextInt(maxNumber - minNumber + 1) + minNumber;
            }
        }
    
        return new BingoCard(cardNumber); 
    }

}

