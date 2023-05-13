package inheritance02;

public class C02_muhasebe extends C01_Ik {
    protected int saatUcreti;
    protected int gunlukCalisma;
    protected int aylikKacGun;
    protected int maasHesapla(){
        maas=saatUcreti*gunlukCalisma*aylikKacGun;
        return maas;
    }
}
