package variables_03;

public class C02_wrapperClass {
    public static void main(String[] args) {
        double dd=129.66;
        double dd2=200.00;
        //System.out.println(dd);//55.66
        //int sayi=(int) dd;
        //byte by=(byte)dd;
        ////System.out.println(by);
        //System.out.println(sayi);//55
        Double wdd=dd;
        //System.out.println(wdd.intValue());//129
        //System.out.println(wdd.byteValue());//-127
        //System.out.println(wdd.toString()+89);//129.6689
        //System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
        //System.out.println(Double.MIN_VALUE);//4.9E-324
        //System.out.println(Double.min(dd,dd2));//129.66 wrapper classlar bize karsilastirma saglayabilirmis
        //System.out.println(Double.max(dd,dd2));//200.0 wrapper classlar bize karsilastirma saglayabilirmis
        //System.out.println(wdd.equals(dd2));//iki deger birbirine esit olmadigi icin false yazdirdi
        //System.out.println(wdd.equals(dd));//iki deger birbirine esit oldugu icin true yazdirdi

        float fl=wdd.floatValue();
       // System.out.println(fl);
        Float wfl=fl;
       // System.out.println(wfl.intValue()+55);//184 int gibi davranmasini sagladik
       // System.out.println(wfl.toString()+77);//129.6677 yanyana yazmasini sagladik
       // System.out.println(Float.MIN_VALUE);//1.4E-45
       // System.out.println(Float.MAX_VALUE);//3.4028235E38
       // System.out.println(wfl.equals(129.66F));//float degerlerde illaki float oldugunu belirtmemiz sart

        //long lo=wfl.longValue();
        //System.out.println(lo);//129
        Long wlo=21474836499L;
        //System.out.println(wlo.equals(129L));
        //System.out.println(Long.MIN_VALUE);//-9223372036854775808
        //System.out.println(Long.MAX_VALUE);//9223372036854775807
        //System.out.println(Integer.MIN_VALUE);//-2147483648
        //System.out.println(Integer.MAX_VALUE);//2147483647

        int sayi=wlo.intValue();//
        System.out.println(sayi);//
        System.out.println(sayi+0.0);//double degerle topladik ondan dolayi double dondurdu
        Integer wsayi=sayi;//19
        System.out.println(wsayi.doubleValue());//double gibi davranmasini sagladik

        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Byte.MAX_VALUE);//127
        System.out.println(Byte.MIN_VALUE);//-128


    }
}
