package scanner03;
import java.util.Scanner;
public class C04_Scanner {
    public static void main(String[] args) {

        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
        //Ödev kullanici uzun kenar bilgisini kısa kenar bilgisinden buyuk girdi mi diye kontrol ediniz

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen uzun kenari,kısa kenari ve yukseligi sirasiyla giriniz");
        double uzunKenar= input.nextDouble();
        //System.out.println("lutfen kısa kenari giriniz");
        double kisaKenar= input.nextDouble();
        //System.out.println("lutfen yuksekligi giriniz");
        double yukseklik= input.nextDouble();
        System.out.println("prizmanin hacmi : "+uzunKenar*kisaKenar*yukseklik);

    }
}
