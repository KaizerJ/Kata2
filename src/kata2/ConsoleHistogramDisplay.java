package kata2;

public class ConsoleHistogramDisplay<T> implements HistogramDisplay<T>{

    public ConsoleHistogramDisplay() {
    }

    @Override
    public void show(Histogram<T> histogram) {
        for (T value : histogram) {
            System.out.println(value + " " + histogram.getCount(value));
        }        
    }
}