import java.util.Scanner;

public class syf128 {

    public static void main(String[] args) {
        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle= scan.nextLine();

        String tersCumle="";

        for (int i = cumle.length()-1; i >= 0; i--) {
            tersCumle+=cumle.substring(i,i+1);
            
        }
        System.out.println(tersCumle);


    }
}
