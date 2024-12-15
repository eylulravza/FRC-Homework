import java.util.Scanner;
import java.util.ArrayList;

public class NotFonksiyon {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> notlar= new ArrayList<>();
        notlar.add(95);
        notlar.add(90);
        notlar.add(100);
        for(int n=0; n<notlar.size(); n++){
            System.out.println("Notlarınız:" + notlar.get(n));
        }
        System.out.println("Kaç not eklemek istersiniz?");
        int adet = s.nextInt();

      manuelNot(s, notlar, adet);

      for(int n=0; n<notlar.size(); n++){
        System.out.println("Notlarınız:" + notlar.get(n));
    }

     notOrtalama(notlar);
        
    }

    public static void manuelNot(Scanner s, ArrayList<Integer> notlar, int adet){
        for (int i=0; i<adet; i++){
            System.out.println("Notunuz:");
            int not= s.nextInt();
            notlar.add(not);
        }
    }

    public static void notOrtalama(ArrayList<Integer> notlar){
        double topla=0;
        for(int e=0; e<notlar.size(); e++){
            topla += notlar.get(e);
        }
         double ortalama = topla/notlar.size();
         System.out.println("Not Ortalamanız:" + ortalama);
    }
}
