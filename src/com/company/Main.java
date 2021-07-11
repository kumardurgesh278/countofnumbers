package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
      /*  int[] i = {1,2,3,4,5,3,4,5,7};
        Arrays.stream(i)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
                .stream()
                .collect(Collectors.groupingBy(s -> s))
                .forEach((k, v)-> System.out.println(k+"  "+v.size()));

       */
        //String s="mimi";
        System.out.println("mimi".chars().filter(x -> x == 'm').count());
    }
}
