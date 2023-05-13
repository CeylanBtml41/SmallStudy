package exception02;

public class YasHatasi  extends Exception{//Throwable exception olusturulmak icin kullanılan bir class
    public YasHatasi(String msg){
        super(msg);
        System.out.println("bu hatayi biz olusturduk");
    }
}
