package scanner03;
import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin
        // toplam,fark ve carpimlarini yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen 1. tam sayiyi giriniz");
        int sayi1= input.nextInt();
        System.out.println("lutfen 2. tam sayiyi giriniz");
        int sayi2=input.nextInt();
        System.out.println("toplamlari : "+(sayi1+sayi2));//toplamlari : 9
        System.out.println("farklari : "+(sayi1-sayi2));//farklari : 1
        System.out.println("carpimlari : "+sayi1*sayi2);//carpimlari : 20

    }
}