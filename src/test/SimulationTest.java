import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void constructorTest() {
        // Given
        Integer numOfDice = 2;
        Integer thrown = 1000000;


        // When
        Simulation sim = new Simulation(numOfDice, thrown);

        Dice dice = new Dice(numOfDice);
        Integer actual = dice.getNumberOfDice();


        // Then
        Assert.assertEquals(numOfDice, actual);
    }

    @Test
    public void runSimulationTest() {
        // Given
        Integer numOfDice = 2;
        Integer thrown = 1;


        // When
        Simulation sim = new Simulation(numOfDice, thrown);

        sim.runSimulation();

        Dice dice = new Dice(numOfDice);
        Bins bins = new Bins(numOfDice, numOfDice * 6);
        Integer toss_result = dice.tossAndSum();
        bins.incrementBin(toss_result);

        Integer actual = bins.getValue(toss_result);


        // Then
        Assert.assertEquals(thrown, actual);
    }


}
