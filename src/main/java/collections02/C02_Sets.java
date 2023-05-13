package collections02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C02_Sets {
    public static void main(String[] args) {
        Set<Object>set1=new HashSet<>();//random bir sekilde yazdirir
        Set<Integer>set2=new TreeSet<>();//sırali bir sekilde yazdirir


        set1.add(57);
        set2.add(57);
        set2.add(19);
        set1.add(19);
        set1.add(28);
        set2.add(28);
        set2.add(34);
        set1.add(34);
        System.out.println("set2 : "+set2);
        set1.add("ahmet");
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(Arrays.toString(set1.toArray()));
        Object [] arr=set1.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
