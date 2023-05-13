package exception02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=0;
        int sayi2=20;
        String str="ahmet";
        try {
            System.out.println("try bloguna hosgeldiniz");
            sayi= scan.nextInt();//InputMismatchException
            System.out.println(sayi2 / sayi);//AritmeticException
            System.out.println(str.charAt(sayi));//StringIndexOutOfBoundsException;
            System.out.println("try blogu basari ile sonlandi ve deger atamasi basarili : "+sayi);
        } catch (ArithmeticException e) {
           System.out.println("matematiksel bir islemde sorun olustu");
           throw new ArithmeticException("bir sayiyi bile duzgun bolemiyorsun");
        }catch (InputMismatchException e){
            System.out.println("deger atamasinda bir sorun olustu");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("stringin disina ciktigimiz icin bir hata olustu");
        }finally {
            System.out.println("try blogu sonlandi tekrar bekleriz");
        }

        System.out.println("sayimiz : "+sayi);


    }
}
