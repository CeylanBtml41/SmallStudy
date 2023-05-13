package exception02;

import exception02.YasHatasi;

import java.util.Scanner;

public class C02_exception {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        checkYas(yas);
    }

    public static void checkYas(int yas) throws Exception {
        if (yas<18){
            throw new YasHatasi("daha bebesin buyude gel");
        }else if (yas>100){
           throw new YasHatasi("yasin 100den buyuk olmus ehliyet almak yeni mi aklina geldi");
        }else
            System.out.println("ehliyet alabilirsin bundan dolayi bilgilerini doldurmaya devam et");
    }
   // AritmeticException : sifira bolme basta olmak uzere matematiksel hatalari belirtir
   // NullpointerException : Henüz deger atamasi yapmadigmiz degiskenler uzerinde islem yapmaya calisirsak dondurur
   // IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
   // ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
   // IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
   // NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
   // ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
   // StringIndexOutOfBoundsException: Bir String index'inin disina cikarsak aldigimiz hata
   // UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır./
   // YasHatasi : eger javada bir programda yasla ilgili bir sinir ya da kisitlama kullanmak icin checkAge methodunu cagirirsaniz alabilirsiniz
}
