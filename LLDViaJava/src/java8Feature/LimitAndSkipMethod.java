package java8Feature;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipMethod {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(4,5,6,8,23,35,36,77,78,99);
        System.out.println("use limit method");
        list.stream().limit(6).forEach(x-> System.out.println(x));
        System.out.println(" use skip method");
        list.stream().skip(6).forEach(x-> System.out.println(x));
    }
}
