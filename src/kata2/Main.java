package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram histogram = new Histogram(1,-1,2,3,4,2,4,5,7,11,-5);
        new ConsoleHistogramDisplay().show(histogram);
    }
    
}
