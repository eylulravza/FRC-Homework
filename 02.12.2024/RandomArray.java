import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RandomArray {
    public static void main(String[] args){
        
        Random random1 = new Random();
        ArrayList<Integer> dizi= new ArrayList<>();
        for(int i=0; i<15; i++){
            int randomsayi= random1.nextInt(101)-1;
            dizi.add(randomsayi);
        }

        for(int i=0; i<dizi.size(); i++){
            System.out.println("Dizinin " + (i+1) +  ". elemanı " + dizi.get(i));
        }
        Collections.sort(dizi);
        
        
         
        System.out.println("Küçükten büyüğe doğru sıralama:" + dizi);

    }
}

    /* 
        int n=0;
        int m=0;
        int max = dizi.get(n);
        while(m > dizi.size()){
            for(n=0; n>(dizi.size()/2); n++){
                if(dizi.get(n+1)>max){
                    max = dizi.get(n+1);
                }
               
            }
            m++;
        } */