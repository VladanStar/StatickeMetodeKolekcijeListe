package com.company;


import java.util.*;

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

        // obrnuti red elemenata u listi

        List<Integer> list4 = Arrays.asList(1,2,3,4,5,6,7);
        Collections.reverse(list4);
        System.out.println(list4);

        // redosled elemenata na slucajan nacin
        List<String> list5 = Arrays.asList("Vladan","Milos","Aleksandar","Zoran","Milutin");
        Collections.shuffle(list5);
        System.out.println(list5);

        // redosled elemenata na slucajan nacin, dve liste


        List<String> list6 = Arrays.asList("red","green","yellow","blue");
        List<String> list7 = Arrays.asList("green","yellow","blue","red");
        Collections.shuffle(list7,new Random(20));
        Collections.shuffle(list6,new Random(20));
        System.out.println(list7);
        System.out.println(list6);


        //kopiranje u listu sa istim indeksom
        List<String> list8 = Arrays.asList("yellow","red","green","blue");
        List<String> list9 = Arrays.asList("white","black");
        Collections.copy(list8,list9);
        System.out.println(list8);

        // nepromenljiva lista koja ima n kopija
        List<GregorianCalendar> list10 =Collections.nCopies(5, new GregorianCalendar(2005,0,1));

        // zamena elemenata specificiranim elementima
        List<String> list11 = Arrays.asList("red","green","blue");
        Collections.fill(list11,"black");
        System.out.println(list11);

        // metod disjoint vraca true ako liste nemaju zajednickih elemenata

        Collection<String> collection1 = Arrays.asList("Vladan","Zoran","Predrag");
        Collection<String> collection2 = Arrays.asList("Burovic","Markovic","Mangel");
        Collection<String> collection3 = Arrays.asList("Jelena","Mirjana","Marija");
        System.out.println(Collections.disjoint(collection1,collection2));
        System.out.println(Collections.disjoint(collection2,collection3));


    }
}
