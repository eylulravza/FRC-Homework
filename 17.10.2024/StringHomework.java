import java.util.Scanner;

public class StringHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String isim;
        String soyisim;
       
        System.out.println("Lütfen isminizi giriniz:");
        isim = input.nextLine();
        System.out.println("Lütfen soyisminizi giriniz:");
        soyisim = input.nextLine();
       
        char basharf = isim.charAt(0);
        System.out.println("İsminizin baş harfi:" + basharf + " 'dir");

        String tamisim = (isim).concat (soyisim);
        System.out.println("İsim ve soyisminiz:" + tamisim);

        System.out.println("İsminizdeki harf sayısı:" + isim.length());
        System.out.println("Soyisminizdeki harf sayısı:" + soyisim.length() );
        System.out.println("Tam isminizdeki harf sayısı:" + tamisim.length() );

        if (tamisim.contains("E") || tamisim.contains("e")) {
            System.out.println("İsminizde e harfi bulunmaktadır");
        }
     
     }
}

 
