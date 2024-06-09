package java8Feature;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {

    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(10,28,87,10,20,76,28,80,80,80);
    /*    Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i=0;i<list.size();i++){
            // If the element is already in the set, it is a duplicate
            if (set.contains(list.get(i))) {
                duplicates.add(list.get(i));
            } else {
                set.add(list.get(i));
            }
        }
        // Print the duplicates
        System.out.println("Duplicate elements: " + duplicates);*/
        Set<Integer> set = new HashSet<>();
        System.out.println("print duplicate element");
        list.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(x-> System.out.println(x));


    }
}
