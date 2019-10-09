package kata2;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Histogram implements Iterable<Integer>{
    private final Map<Integer,Integer> counts = new TreeMap<>();
    
    public Histogram(int... values){
        for (int value : values) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return counts.keySet().iterator();
    }

    public int getCount(Integer value) {
        return counts.getOrDefault(value, 0);
    }
    
}
