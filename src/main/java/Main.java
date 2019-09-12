import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static int[] sortByValueAndIndex(int[] array) {
        List<Integer> alist = new ArrayList<Integer>();
        for(int i =0; i<array.length; i++){
            alist.add( array[i] * (i+1));
        }
        Collections.sort(alist);
        return alist.stream().mapToInt(i -> i).toArray();
    }

    public static void main (String args[]){
        int[] array = {3,50,9,8,5};
        sortByValueAndIndex( array);
    }

}
