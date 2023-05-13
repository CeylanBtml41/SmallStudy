package inheritance02;

public class C01_Ik {
    public static int sayac=100;
    protected String isim;
    protected String soyIsim;
    protected String adres;
    protected String tel;
    protected int id;
    protected String bolum;
    protected int maas;

    public int idAtama(){
        id=sayac;
        sayac++;
        return id;
    }

}
