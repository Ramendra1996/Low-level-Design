package java8Feature;

//count the no of occurrence of words in given string using java 8

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOccuranceInString {
    public static void main(String[] args) {
        String str = "welcome to code decode and code decode welcome you";
        List<String >list = Arrays.asList(str.split(" "));

       /**
         Collectors.groupingBy(Function.identity(), Collectors.counting()):
        Function.identity(): Returns a function that returns its input argument (used as the classifier function for grouping).
        Collectors.counting(): Returns a collector that counts the number of elements in each group.
        */
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
