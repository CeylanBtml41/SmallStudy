package inheritance02;

public class C04_memur extends C02_muhasebe{
    int saatUcreti=20;
    int aylikKacGun=20;
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

    public static void main(String[] args) {
        C04_memur memur1=new C04_memur();
        memur1.isim="Enver";
        memur1.soyIsim="Mert";
        memur1.adres="Istanbul";
        memur1.tel="5559995252";
        memur1.bolum="IT";
        memur1.id=memur1.idAtama();
        memur1.maas=memur1.maasHesapla();
        System.out.println(memur1.maas);
        System.out.println(memur1.id);
        System.out.println(memur1.toString());
    }

    @Override
    protected int maasHesapla() {
        maas=saatUcreti*aylikKacGun*gunlukCalisma;
        return maas;
    }
}
