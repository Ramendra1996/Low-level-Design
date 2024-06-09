package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(11);
        list.add(6);
        list.add(16);
        list.add(19);

        // check Filter
        System.out.println("check filter");
         list.stream().filter(i->i>=5).forEach(integer -> System.out.println(integer));
         //check Map
        System.out.println("check map");
        list.stream().map(integer -> integer*integer).forEach(integer -> System.out.println(integer));
        // check collect store the element in list ,set map etc
        System.out.println("check collect");
        List<Integer> collect = list.stream().filter(integer -> integer >= 10).collect(Collectors.toList());
       /* for (Integer i:collect){
            System.out.println(i);
        }*/
        collect.forEach(integer -> System.out.println(integer));

        //check count
        System.out.println("check count");
        long count = list.stream().filter(integer -> integer >= 10).count();
        System.out.println(count);

        //check sorted in increasing order
        System.out.println("incr order sorted");
        list.stream().sorted().forEach(integer -> System.out.print(integer+" "));
        System.out.println();
        //check sorted in decreasing order
        System.out.println("desc order sorted");
        list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(integer -> System.out.print(integer+" "));

        //check minimum
        System.out.println("check minimum");
        Integer min=list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("minimum="+min);
        //check maximum
        System.out.println("check maximum");
        Integer max= list.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("maximum="+max);

        //convert list in array
        System.out.println("convert list in array");
        for (Object array : list.stream().toArray()) {
            System.out.print(array +" ");
        }

        //check of method
        System.out.println("check of method");
        Stream.of(1,11,111,1111,11111).forEach(x-> System.out.println(x));
        //another example
        String [] name = {"Code","Decode","Demos"};
        Stream.of(name).filter(x->x.length()>4).forEach(x-> System.out.println(x));
    }
}
