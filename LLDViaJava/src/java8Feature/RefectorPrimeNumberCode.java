package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RefectorPrimeNumberCode {
    public static  boolean isPrime(int number){
        boolean isDivisible = false;
        for (int i=2;i<number;i++){
            if(number%i==0){
                isDivisible=true;
                break;
            }
        }
        return number >1 && !isDivisible;
    }

    //refactor the code
    public static boolean isPrime1(int number){
      return number >1 && IntStream.range(2,number).noneMatch(n->number%n==0);
    }




    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println("java 8 se");
        System.out.println(isPrime1(6));

        //new code
        List<Double> sqrt = new ArrayList<>(10);
        int index=1;
        while (sqrt.size()<10){
            if (isPrime1(index)){
                sqrt.add(Math.sqrt(index));
            }
            index++;
        }
        System.out.println(sqrt);

      //  using java 8
        System.out.println("use java 8");
        List<Double>sqrt1 = Stream.iterate(1,i->i+1).filter(RefectorPrimeNumberCode::isPrime1)
                           .map(Math::sqrt).limit(10)
                            .collect(Collectors.toList());
        System.out.println(sqrt1);

    }

}
