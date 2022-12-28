import java.util.Scanner;

public class carsamba1 {
    public static void main(String[] args) {

        // Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        // ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime ve bir karakter girin");
        String kelime= scan.next();
        char karakter= scan.next().charAt(0);
        // cekoslavakyalilastiramadiklarimizdanmisiniz
        // i
        int sayac=0;
        for (int i = 0; i <kelime.length(); i++) {
            if (karakter==kelime.charAt(i))
                sayac++;
        }
        System.out.println(sayac);

        char karakter1= scan.next().charAt(0);
        // cekoslavakyalilastiramadiklarimizdanmisiniz
        // i
        int sayac1=0;
        for (int i = 0; i <kelime.length(); i++) {
            if (karakter1==kelime.charAt(i))
                sayac1++;
        }
        System.out.println(sayac1);
    }



}
