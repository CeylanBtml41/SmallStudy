package collections02;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C03_maps {
    public static void main(String[] args) {
        Map<String,Integer> map1=new TreeMap<>();//keylere gore siralar
        map1.put("elliyedi",57);
        map1.put("ondokuz",19);
        map1.put("yirmisekiz",28);
        map1.put("otuzdort",34);
        System.out.println(map1);
        System.out.println(map1.get("elliyedi"));//anahtardan
        
    }
}
