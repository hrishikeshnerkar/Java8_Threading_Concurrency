package Java8.String;

public class StringPerformance {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Java8.String testString="";
        // for (int i = 0; i <= 100000; i++) {
        //     testString+=i;
        // }

        //Using Stringbuilder
        // StringBuilder something = new StringBuilder("");
        // for (int i = 0; i <= 100000; i++) {
        //     something.append(i);
        // }

        //Using StringBuffer
        StringBuffer anything = new StringBuffer("");
        for (int i = 0; i <= 100000; i++) {
            anything.append(i);
        }

        long endTime = System.nanoTime();
        long totalTime = endTime-startTime;
        System.out.println("It took "+ totalTime/1000000+ " milliseconds");
    }
}
