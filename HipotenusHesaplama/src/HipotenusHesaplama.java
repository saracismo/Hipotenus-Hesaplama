import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyorum.

        int a, b;
        double c;

         // Veri isteme kısmını yazalım.

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a = input.nextInt();

        System.out.print("2. Kenarı Giriniz :  ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus  : " +c);

        // Alan için değişken tanımlama ve kodlarını yazalım.

        double u = (a+b+c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı: " + alan);




    }
}





