


import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void constructorTest() {
        // Given
        Integer numOfDice = 5;


        // When
        Dice dice = new Dice(numOfDice);
        Integer actual = dice.getNumberOfDice();


        // Then
        Assert.assertEquals(numOfDice, actual);
    }



    @Test
    public void tossAndSumTest() {
        // Given
        Integer numOfDice = 2;


        // When
        Dice dice = new Dice(numOfDice);


        Integer actualSum = dice.tossAndSum();

        ;


                // Then
                Assert.assertTrue(2<=actualSum && actualSum<=12);
    }





}
