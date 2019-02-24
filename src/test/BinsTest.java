import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void constructorTest() {
        // Given
        Integer numOfDice = 5;
        Integer maxVal = numOfDice*6;


        // When
        Bins bins = new Bins(numOfDice, numOfDice*6);
        Integer actualmin = bins.getLowestValue();
        Integer actualmax = bins.getHighestValue();


        // Then
        Assert.assertEquals(numOfDice, actualmin);
        Assert.assertEquals(maxVal, actualmax);
    }


    @Test
    public void incrementBinTest() {
        // Given
        Integer numOfDice = 5;
        Integer maxVal = numOfDice*6;


        // When
        Bins bins = new Bins(numOfDice, numOfDice*6);
        Dice dice = new Dice(numOfDice);
        Integer sum = dice.tossAndSum();
        //Integer bin = bins.getBin(sum);
        Integer prev = bins.getValue(sum);
        Integer expected = prev+1;
         bins.incrementBin(sum);
         Integer after = bins.getValue(sum);



        // Then
        Assert.assertEquals(expected, after);
    }
}
