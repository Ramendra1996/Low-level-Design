package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * fetch the common element in the given two array
 */

/**
 *The boxed() method converts a stream of primitive values into a stream of their corresponding wrapper objects.
 */
public class CommonElementInArray {

    public  static  void fetchCommonElement(int array1[], int array2[]){
        List<Integer> collect = Arrays.stream(array1).filter(array1Number -> Arrays.stream(array2).anyMatch(array2Number -> array2Number == array1Number)).boxed().collect(Collectors.toList());
        System.out.println("common element=="+collect);
    }
    public static void main(String[] args) {

        int array1[]={1,2,3,4,5};
        int array2[]={4,5,6,7,8};
        fetchCommonElement(array1,array2);
    }
}
