package overridinPolymorphism03;

public class C02_overriding extends C01_overriding{
    public String str="childdaki String calisti";
    public void yazdir(){
        System.out.println("childdaki method calisti");
    }

    public static void main(String[] args) {
        C02_overriding obje=new C02_overriding();
        System.out.println(obje.str);
        obje.yazdir();
        C01_overriding obje1=new C02_overriding();
        System.out.println(obje1.str);
        obje1.yazdir();
        C01_overriding obje2=new C01_overriding();
        System.out.println(obje2.str);
        obje2.yazdir();

    }
}
