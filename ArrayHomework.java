import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args){
        String[] dizi = new String[10];
        
        dizi[0] = "Ayşe";
        dizi[1] = "Mehmet";
        dizi[2] = "Eylül";
        dizi[3] = "Ahmet";
        dizi[4] = "Sevgi";
        dizi[5] = "Sevda";
        dizi[6] = "Ali";
        dizi[7] = "Gül";
        dizi[8] = "Ayaz";
        dizi[9] = "Nur";

        ArrayList<String> yenidizi = new ArrayList<>(Arrays.asList(dizi));

        for(int i=0; i<yenidizi.size(); i++){
            System.out.println("Dizinin " + i +  ". elemanı " + yenidizi.get(i));
        }

        Scanner s = new Scanner(System.in);
        System.out.println("Hangi eleman değiştirilsin?");
        int eleman = s.nextInt();
        s.nextLine();
        System.out.println(eleman + ". eleman ne ile değiştirilsin?");
        String yeniisim = s.nextLine();
        
        yenidizi.set(eleman-1, yeniisim);
        
        System.out.println("Yeni eleman " + yenidizi.get(eleman-1));

        for(int i=0; i<yenidizi.size(); i++){
            System.out.println("Dizinin " + i +  ". elemanı " + yenidizi.get(i));
        }

        System.out.println("Hangi elemanı kaldırmak istersiniz?");
        int silme = s.nextInt();

        yenidizi.remove(silme-1);
        
        for(int i=0; i<yenidizi.size(); i++){
            System.out.println("Dizinin " + i +  ". elemanı " + yenidizi.get(i));
        }

        for(int i=0; i<yenidizi.size(); i++){
            System.out.println(yenidizi.get(i).toUpperCase());
        }
    }
    
}
