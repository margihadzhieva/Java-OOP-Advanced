package L03_Generics_Lab.P05_NullFinder;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListUtils {
    public static <T extends Comparable> T getMin(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        return (T) list.stream().min(Comparator.naturalOrder()).get();
    }
    
    public static <T extends Comparable> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        return list.stream().max(Comparable::compareTo).get();
    }
    
    public static <T> List<Integer> getNullIndices(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        List<Integer> nullIndices = new LinkedList<>();
    
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null){
                nullIndices.add(i);
            }
        }
        
        return nullIndices;
    }
}
