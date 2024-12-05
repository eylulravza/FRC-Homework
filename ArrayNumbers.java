import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> yenidizi = new ArrayList<>();
        yenidizi.add(4);
        yenidizi.add(3);
        yenidizi.add(1);

        for(int i=0; i<yenidizi.size(); i++){
            System.out.println("Dizinin " + (i+1) +  ". elemanı " + yenidizi.get(i));
        }

        for ( int i=0; i<3; i++){
            System.out.println("Eklemek istediğiniz sayı:");
            int sayi = s.nextInt();

            yenidizi.add(sayi);
        }

        for(int i=0; i<yenidizi.size(); i++){
            System.out.println("Dizinin " + (i+1) +  ". elemanı " + yenidizi.get(i));
        }

        System.out.println("Hangi elemanlar arası işlem yapmak istiyorsunuz?");
        int eleman1 = s.nextInt();
        int eleman2 = s.nextInt();
        s.nextLine();
        System.out.println("Hangi işlemi yapmak istiyorsunuz? (-, +,/,*, ortalama, max)");
        String islem = s.nextLine();

        if(islem.equals("+")){
            int toplama= yenidizi.get(eleman1) + yenidizi.get(eleman2);
            System.out.println("Sonuç:" + toplama);
        }
        else if(islem.equals("-")){
            int cıkarma= yenidizi.get(eleman1) - yenidizi.get(eleman2);
            System.out.println("Sonuç" + cıkarma);
        }
        else if(islem.equals("*")){
            int carpma = yenidizi.get(eleman1) * yenidizi.get(eleman2);
            System.out.println("Sonuç" + carpma);
        }
        else if(islem.equals("/")){
            int bolme = yenidizi.get(eleman1) / yenidizi.get(eleman2);
            System.out.println("Sonuç" + bolme);
        }
        else if(islem.equals("ortalama")){
            int ortalama = (yenidizi.get(eleman1) + yenidizi.get(eleman2))/2;
            System.out.println("Sonuç" + ortalama);
        }
        else if(islem.equals("max")){
            int max = yenidizi.get(0);
            for(int m=1; m>yenidizi.size(); m++){
                if(yenidizi.get(m)>max){
                    max = yenidizi.get(m);
                }
            }
            System.out.println("Dizideki en büyük değer:" + max);
        }

    }
}
