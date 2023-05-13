package dataType03;

import java.util.Scanner;

public class C02_variable {
    public static void main(String[] args) {
        String str="789";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println("lutfen bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
        System.out.println(sayi);
        C01_variable deneme1=new C01_variable();//C01_variable data tipine sahip bir variable olusturduk



    }
}
