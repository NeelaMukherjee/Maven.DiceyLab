import java.util.Random;

public class Dice {

    Integer numDice;
    private  Random diecast;

    public Dice(Integer numDice) {

        this.numDice = numDice;
        this.diecast = new Random();
    }

    public int getNumberOfDice() {
        return numDice;
    }

    public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numDice; i++) {
            sum += dieResult();
        }
        return sum;
    }

    private int dieResult() {
        return diecast.nextInt(6) + 1; // As random.nextInt(6) will return numbers from 0 to 5 thus adding the plus 1
    }

    }

