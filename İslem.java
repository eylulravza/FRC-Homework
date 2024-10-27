import java.util.Scanner;
import java.util.Arrays;



public class İslem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       

        while(true) {
            System.out.println("Yapmak istediğiniz işlemi girin (+,-,/,*)");
       String calculate = input.nextLine();

            if(calculate.equalsIgnoreCase("escape")){
            System.out.println("Sistem sonlandı");
              break;
           }
        
        
       
    
       if(calculate.equals("+") || calculate.equals("-") || calculate.equals("*") || calculate.equals("/")  ) {
       System.out.println("İstediğniz sayı sayısını  girin");
        int sayisayisi = input.nextInt();
        int[] sayilar = new int[sayisayisi]; 

        
     System.out.println("Lütfen sayı giriniz:");
       for(int i = 0; i < sayisayisi; i++) {
       sayilar[i]= input.nextInt();
       }
        
       System.out.println("Sayılarınız: " + Arrays.toString(sayilar));

      

       double sonuc = sayilar[0];
   
       if (calculate.equals("+")){
        for (int i = 1; i < sayilar.length; i++) {
            sonuc = sonuc + sayilar[i];
       } 
    }
       else if(calculate.equals("-")){
        for (int i = 1; i < sayilar.length; i++){
            sonuc = sonuc - sayilar[1];       
        }
    }
    else if(calculate.equals("*")){
        for (int i = 1; i < sayilar.length; i++){
            sonuc = sonuc * sayilar[i];

        }
    }
    else if(calculate.equals("/")){
        for (int i =1; i < sayilar.length; i++){
            if (sayilar[i] == 0) {
                System.out.println("Bir sayıyı 0'a bölemezsiniz!");
                return;
                
        }
        sonuc /= sayilar[i];
    }
    }



       System.out.println(sonuc);
        break;
     }
    }

    
    



}
}


//int dizi[] = new int[sayisayisi];
        //int dizi[] = {sayisayisi};
        //int sayidizisi [] = {sayi};
       // Arrays.fill(sayidizisi, sayi);
        //System.out.println("Sayılarınız:");
        //for(int i=0;i<sayidizisi.length;i++)
         //System.out.print("["+sayidizisi[i]+"] ");