package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
   Given an array of integers, write a java 8 program to find the second-smallest element
 */

public class SecondSmallestElement {

    public  static  void  fetchSecondSmallest(int array[]){
/*
        List<Integer> sortedList = Arrays.stream(array).sorted().boxed().collect(Collectors.toList());
        System.out.println(sortedList);*/

        int i = Arrays.stream(array).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException());
        System.out.println(i);
    }
    public static void main(String[] args) {

         int array[]={5,2,8,3,1,1};
             fetchSecondSmallest(array);
    }
}
