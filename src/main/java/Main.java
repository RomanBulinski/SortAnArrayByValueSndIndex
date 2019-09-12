import java.util.*;

public class Main {

    public static int[] sortByValueAndIndex(int[] array) {

        Map<Integer, Integer> treemap = new TreeMap<>();
        for(int i =0; i<array.length; i++){
            treemap.put( array[i] * (i+1), array[i] );
        }
        return treemap.values().stream().mapToInt(i -> (int) i).toArray();

    }

}
