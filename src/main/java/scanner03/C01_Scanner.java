package scanner03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=input.nextLine();
        System.out.println(isim);
        System.out.println("Lütfen soyisim giriniz");
        String soyisim=input.next();
        System.out.println(soyisim);
        System.out.println("lutfen yasinizi giriniz");
        int yas= input.nextInt();
        System.out.println(yas);

    }
}
