import java.util.Scanner;

public class carrsamba {


    // Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
    // -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
    // -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
    // Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
    // Örn:
    // isim1= masa
    // isim2= ali
    // Konsol => maalisa

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("iki kelime girin");

        String isim1 = scan.nextLine();
        String isim2= scan.nextLine();
        int orta=isim1.length()/2;
        if (isim1.length()%2==0) {
            System.out.println(isim1.substring(0,orta)+isim2+isim1.substring(orta));

        } else System.out.println("isim1 isme eklenemez");



    }
}
