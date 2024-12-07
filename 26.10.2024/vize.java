import java.util.Scanner;

public class vize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vize;
        int finalnot;
        int sonuc;

        System.out.println("Vize notunuzu giriniz:");
        vize = input.nextInt();
        System.out.println("Final notunuzu giriniz:");
        finalnot = input.nextInt();

        sonuc = ((vize*35)/100) + ((finalnot*65)/100);

        if (sonuc>=75) {
            System.out.println("Barajı geçtiniz, sonucunuz:" + sonuc);
        }
        else{
            System.out.println("Barajı geçemediniz, sonucunuz:" + sonuc);
        }
    }
}
