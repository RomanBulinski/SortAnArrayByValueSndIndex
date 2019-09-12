import java.util.*;

public class Main {

    public static int[] sortByValueAndIndex(int[] array) {

        Map<Integer, Integer> treemap = new TreeMap<>();
        for(int i =0; i<array.length; i++){
            treemap.put( array[i] * (i+1), array[i] );
        }
        Object[] a = treemap.keySet().toArray();
        List<Object> clist = new ArrayList<>();
        for(int i = 0; i< a.length; i++){
            clist.add( treemap.get(a[i]) );
        }
        return clist.stream().mapToInt(i -> (int) i).toArray();
    }


}
