package collections02;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>ll1=new LinkedList<>();//LinkedList ise hem listin hemde Deque'nin alt classi oldugu icin ikisinde olan tum methodlar var :)
        List<Integer>ll2=new LinkedList<>();
        Queue<Integer>ll3=new LinkedList<>();
        Deque<Integer>ll4=new LinkedList<>();
        ll2.add(57);
        ll2.add(19);
        ll2.add(28);
        ll2.add(1,34);
        ll2.add(1,2);
        ll2.add(3);
       // System.out.println(ll2); //Listte istedigimiz indexe istegimiz// elemani ekleyebilirken Queue'de ekleyemedik sadece sona
        //Listlerde istedigimiz indexteki elemani silebilirken queue'de sadece bastakini silebiliriz
        ll2.remove(3);//direkt olarak index siler eger biz object silmek istiyosan object oldugunu belli etmeliyiz
        ll2.remove((Integer) 2);//
      //  System.out.println(ll2);




        ll3.add(57);
        ll3.add(19);
        ll3.add(28);
        ll3.add(34);
        //System.out.println(ll3);
        ll3.remove();
        ll3.remove(28);
       System.out.println(ll3);
       ll3.clear();
       // System.out.println(ll3.poll());//ilk degeri dondurur//Ctrl X ctrl V//Null
       // System.out.println(ll3.element());//ilk degeri dondurur//Ctrl C ctrl V//NoSuchElementException
       // System.out.println(ll3.peek());//ilk degeri dondurur//Ctrl C ctrl V//null elementten tek farki hata vermemesi



        ll4.add(57);
        ll4.addLast(19);
        ll4.addFirst(28);
        ll4.add(34);
        ll4.clear();
        System.out.println(ll4.pop());//ilk degeri dondurur//Ctrl X ctrl V//NoSuchElementException
        System.out.println(ll4);//



    }
}
