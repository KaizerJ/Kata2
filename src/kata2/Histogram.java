package kata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Histogram <T> implements Iterable<T>{
    private final Map<T,Integer> counts = new TreeMap<>();
    
    public Histogram(T... values){
        for (T value : values) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return counts.keySet().iterator();
    }

    public int getCount(T value) {
        return counts.getOrDefault(value, 0);
    }
    
}
