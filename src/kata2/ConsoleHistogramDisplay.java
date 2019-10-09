package kata2;

public class ConsoleHistogramDisplay implements HistogramDisplay{

    public ConsoleHistogramDisplay() {
    }

    @Override
    public void show(Histogram histogram) {
        for (Integer value : histogram) {
            System.out.println(value + " " + histogram.getCount(value));
        }
    }

    
}