import java.util.Scanner;

public class c02 {
    public static void main(String[] args) {

        //- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("iki basamklı bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int onlarBasamagi=sayi/10;
        int birlerBasamagi=sayi%10;
        String str ="sayi ver";

        switch (onlarBasamagi) {
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmış");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;
                }
        switch (birlerBasamagi){
            case 1: System.out.print("bir");
            break;
            case 2: System.out.print("iki");
            break;
            case 3: System.out.print("üç");
            break;
            case 4: System.out.print("dört");
            break;
            case 5: System.out.print("beş");
            break;
            case 6: System.out.print("altı");
            break;
            case 7: System.out.print("yedi");
            break;
            case 8: System.out.print("sekiz");
            break;
            case 9: System.out.print("dokuz");
            default:
                System.out.print("hatalı giriş");
                
        }


    }
}
