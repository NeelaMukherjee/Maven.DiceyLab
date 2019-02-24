public class Simulation {

    Integer diceNum;
    Integer thrown;
    Dice dice;
    Bins bins;

    public Simulation(Integer diceNum, Integer thrown) {

        this.diceNum = diceNum;
        this.thrown = thrown;
        this.bins = new Bins (this.diceNum, this.diceNum *6);
        this.dice = new Dice(this.diceNum);

    }


        public void runSimulation() {
            int toss_result;
            for (int i = 0; i < thrown; i++){
                toss_result = dice.tossAndSum();
                bins.incrementBin(toss_result);
            }
        }

        public void printBin(){

            int binTotal;

            for (int binNum = this.bins.getLowestValue(); binNum <= this.bins.getHighestValue(); binNum ++) {


                binTotal = bins.getValue(binNum);

                System.out.println(String.format("%2d :%9d", binNum, binTotal));
            }



        }

    }