import java.util.Scanner;
import java.util.ArrayList;

public class SayiFonksiyon {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers would you like to multiply?");
        int adet = s.nextInt();

        ArrayList<Integer> dizi= new ArrayList<>();
        for (int i=0; i<adet; i++){
            System.out.println((i+1) + ". number:");
            int sayi= s.nextInt();
            dizi.add(sayi);
        }

        for(int n=0; n<dizi.size(); n++){
            System.out.println((n+1) + ". number you wanted to multiply:" + dizi.get(n));
        }
        
        System.out.println("Result of your calculation:" + Carpma(dizi));

    }

    public static long Carpma(ArrayList<Integer> dizi){
        int carp=1;
        for(int a=0; a<dizi.size(); a++){
            carp *= dizi.get(a);
        }

        return carp;
    }
    
}
