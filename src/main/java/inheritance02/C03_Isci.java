package inheritance02;

public class C03_Isci extends C02_muhasebe{
    int saatUcreti=25;
    int aylikKacGun=26;
    int gunlukCalisma=8;

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                ", id=" + id +
                ", bolum='" + bolum + '\'' +
                ", maas=" + maas +
                '}';
    }

    @Override
    protected int maasHesapla() {
        maas=saatUcreti*aylikKacGun*gunlukCalisma;
        return maas;
    }

    public static void main(String[] args) {
        C03_Isci isci1=new C03_Isci();
        isci1.isim="Mehmet";
        isci1.soyIsim="yildirim";
        isci1.tel="5559995757";
        isci1.adres="Istanbul";
        isci1.bolum="IT";
        isci1.id=isci1.idAtama();
        isci1.aylikKacGun=30;
        isci1.gunlukCalisma=10;
        isci1.saatUcreti=25;
        isci1.maas=isci1.maasHesapla();
        System.out.println(isci1.toString());
        C03_Isci isci2=new C03_Isci();
        isci2.id= isci2.idAtama();
        System.out.println(isci2.toString());
        System.out.println(isci2.id);


    }
}
