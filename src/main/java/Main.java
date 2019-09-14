import java.util.*;

public class Main {

    public static int[] sortByValueAndIndex(int[] array) {

        Map<Integer, List<Integer> > treemap = new TreeMap<>();
        for(int i =0; i<array.length; i++){
            if( !treemap.keySet().contains( array[i] * (i+1)  )){
                List<Integer>  tempA  = new ArrayList<>();
                tempA.add( array[i] );
                treemap.put( array[i] * (i+1), tempA );
            } else if( treemap.keySet().contains( array[i] * (i+1) )){
                List<Integer>  tempB = treemap.get(array[i] * (i+1));
                tempB.add(array[i] );
                treemap.put( array[i] * (i+1), tempB );
            }
        }
        List<Integer> presult = new ArrayList<>();
        Collection<List<Integer>> collectionA = treemap.values();
        for( List lista : collectionA){
            for( Object i : lista){
                presult.add( (int)i );
            }
        }
        return presult.stream().mapToInt(t -> t).toArray();
    }

}
