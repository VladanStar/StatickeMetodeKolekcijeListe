package com.company;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //sortiranje elementa liste

        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.sort(list);
        System.out.println(list);

        // sortiranje po opadajucem redosledu
        List<String> list1 = Arrays.asList("yellow","red","green");
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        // binarySearch metod
        List<Integer> list2 = Arrays.asList(2,4,7,10,11,45,50,59,60,66);
        System.out.println("(1) Index: " + Collections.binarySearch(list2,7));
        System.out.println("(2) Index: " +Collections.binarySearch(list2,9));

        List<String> list3 = Arrays.asList("blue","green","red");
        System.out.println("(3) Index: " + Collections.binarySearch(list3, "red"));
        System.out.println("(4) Index: "+ Collections.binarySearch(list3,"cyan"));
        



    }
}
