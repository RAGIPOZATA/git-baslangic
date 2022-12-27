import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {

        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan =new Scanner(System.in);

        System.out.println("lğtfen bir sayı giriniz");
        int sayi = scan.nextInt();


        if (sayi%5==0) System.out.println("sayi 5'in katıdır");
        else System.out.println("5in katı değil");


    }
}
