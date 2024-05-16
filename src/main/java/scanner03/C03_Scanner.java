package scanner03;
import java.util.Scanner;
public class C03_Scanner {
    public static void main(String[] args) {
        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²(r*r)dir(pi sayisini 3 alabilirsiniz)

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen yarıcapi giriniz");
        double r= input.nextDouble();
        System.out.println("dairenin cevresi : "+2*Math.PI*r);
        System.out.println("dairenin alani : "+Math.PI*r*r);//Math.pow(r,2);
    }
}
