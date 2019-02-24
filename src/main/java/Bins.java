import java.util.TreeMap;

public class Bins {

    Integer minKey;
    Integer maxKey;
    private TreeMap<Integer, Integer> binsTreeMap;


    public Bins(Integer minKey, Integer maxKey) {

        this.maxKey = maxKey;
        this.minKey = minKey;
        this.binsTreeMap = new TreeMap< Integer, Integer>();
        for(int i=minKey; i<=maxKey; i++) {

            binsTreeMap.put(i, 0);

        }

    }


        public Integer getBin(Integer binNumber) {
            return binsTreeMap.get(binNumber);
        }

        public void incrementBin(Integer binNumber) {
            Integer currentValue = binsTreeMap.get(binNumber);
            if (currentValue != null) {
                binsTreeMap.put(binNumber, currentValue + 1);
            }
        }

        public Integer getValue(Integer binNumber){

        Integer value = binsTreeMap.get(binNumber);
         return value;


        }

        public int getLowestValue() {
            return minKey;
        }

        public int getHighestValue() {
            return maxKey;
        }

    }




