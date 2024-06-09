package java8Feature;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
/*
        //without use optional class
        String[] str = new String[10];
        String lowercaseString = str[5].toLowerCase();
        System.out.print(lowercaseString);*/


        //use optional class

        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }

}
