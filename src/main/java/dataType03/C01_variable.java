package dataType03;

public class C01_variable {
    public static void main(String[] args) {
        char ch='?';
        System.out.println("kitap okuyor mu"+ch);//kitap okuyor mu?
        System.out.println(5+ch);//Ascii degeri alip toplar
        boolean ogrenciMi=true;
        System.out.println(ogrenciMi);
        byte by=35;
        System.out.println(by);
        int sayi=127;
        //byte sayi2=sayi;//byte bir degere int deger atayamayiz sayimiz 128'den kucuk olsa bile
        System.out.println(sayi);//127
        short sh=27;
        System.out.println(sh);
        long lo=251323211;
        System.out.println(lo);
        float fl=15.6F;
        System.out.println(fl);
        double dd=13;
        System.out.println(dd);//13.0 yazdirir int deger girsek bile bize double dondurur
        //int sayi2=sayi+dd;//int deger girsek bile double bir degeri int bir deger atayamayiz
        System.out.println(by+sayi+sh+lo+fl+dd);//2.51323421E8 bize double deger dondurur cunku double en kapsamli olan













    }
}
