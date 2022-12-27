import java.util.Locale;
import java.util.Scanner;

public class sss {

    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.

        Scanner scan =new Scanner(System.in);

        System.out.println("isim giriniz");
        String ad = scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyad=scan.nextLine();

        if (ad.length()>soyad.length()) System.out.println(ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase()+" "+
                                                            soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase());
         else if (ad.length()<soyad.length()) System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()+" "+
                                                            soyad.toUpperCase());

    }
}
