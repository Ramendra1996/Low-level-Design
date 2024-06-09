package java8Feature;

import java.util.Arrays;

/**
   Given an array of strings, write a java 8 program to find the
   length of the longest String
 */

public class FindLengthLongestString {

    public  static  void  fetchLongestLength(String []str){
        int i = Arrays.stream(str).mapToInt(string -> string.length()).max().orElse(0);
        System.out.println("max length=="+i);

        int i1 = Arrays.stream(str).mapToInt(String::length).max().orElse(0);
        System.out.println("max length=="+i1);
    }
    public static void main(String[] args) {
        String [] str= {"Apple","Banana","Avocado","Apricot","Grapes"};
        fetchLongestLength(str);

    }
}
