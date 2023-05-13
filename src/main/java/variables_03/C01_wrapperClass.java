package variables_03;

public class C01_wrapperClass {
    public static void main(String[] args) {
        /*
        char          Character
        boolean       Boolean
        int           Integer
        byte
        short
        long          Long
        double        Double
        float         Float
         */
        char ch='a';
        // System.out.println(ch);//a
        // System.out.println(ch+"li");//ali
        // System.out.print(ch+77);//174
        // Character wch=ch;
        // System.out.println(wch);//a
        // System.out.println(wch+"li");//ali
        // System.out.println(wch.toString()+77);//wch variable'imiz string olarak davranacak ondan dolay a77 yazdirdi
        // System.out.println(wch.equals('a'));//esitligi kontrol eder true dondurdu
        // System.out.println(wch.toString().toUpperCase());//String gibi davrandigimiz zaman string methodlarina ulasabiliriz

        boolean ogrenciMi=true;
        System.out.println(ogrenciMi);//true
        //System.out.println(ogrenciMi+6);//biz boolean bir degeri sayi ile yazdiramayiz
        Boolean wOgrenciMi=ogrenciMi;
        System.out.println(wOgrenciMi.toString()+6);//String gibi davrandigi icin sayi ile yazdirabildik
        System.out.println(wOgrenciMi.equals(ogrenciMi));//true
        System.out.println(Boolean.valueOf("true"));//true ya da false giricez bunlar string olarak yazarsak bize boolean olarak dondurur






    }
}
