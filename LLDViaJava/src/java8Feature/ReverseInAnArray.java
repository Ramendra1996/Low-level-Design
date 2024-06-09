package java8Feature;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseInAnArray {

    public  static  void  reverseArray(int array[]){
        IntStream.range(0,array.length/2).forEach(i->{
            int temp =array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        });
        System.out.println("reverse Array=="+ Arrays.toString(array));
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        reverseArray(array);
    }
}
