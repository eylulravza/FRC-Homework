import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi;
        int sonuc=1;
        int i=1;
        System.out.println("(Factorial) Please type the number you want to calculate");
        sayi = input.nextInt();

        while (i<=sayi) {
            sonuc *= sayi;
            sayi--;
        }

        System.out.println("Result:" + sonuc);
    
    }
}
