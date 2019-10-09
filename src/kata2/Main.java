package kata2;

public class Main {

    public static void main(String[] args) {
        Histogram<Integer> histogram = new Histogram(1,-1,2,3,4,2,4,5,7,11,-5);
        new ConsoleHistogramDisplay().show(histogram);
        
        Histogram<Character> histogram2 = new Histogram('a','b','a','z','d','h','j','j','i','j');
        new ConsoleHistogramDisplay<Character>().show(histogram2);
        
        Histogram<String> histogram3 = new Histogram<>("Hello","World","Hello","Works?","HELLO");
        new ConsoleHistogramDisplay<String>().show(histogram3);
    }
    
}
