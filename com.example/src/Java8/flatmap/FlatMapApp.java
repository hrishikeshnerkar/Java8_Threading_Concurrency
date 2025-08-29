package Java8.flatmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapApp {
    public static void main(String[] args) {
        Integer[][] lotteryNumbers = new Integer[][]{
                {5,23,54,67,98,45},
                {15,4,3,89,45,5},
                {7,24,37,90,55,66},
                {53,66,1,8,42,7},
        };
        List<Integer> lotteryNumbersSet = Stream.of(lotteryNumbers)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("the lottery numbers set are:"+ lotteryNumbersSet);
        /*
            Java8.map() is used to transform each element of a stream, while flatMap() is used to transform each element into a stream and then flatten all those Java8.streams into a single stream.        * */
    }
}
