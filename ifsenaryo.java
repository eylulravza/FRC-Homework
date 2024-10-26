import java.util.Scanner;

public  class ifsenaryo  {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sinif;

        System.out.println("Sınıfınızı giriniz:");
        sinif = s.nextInt();

        boolean sonuc= sinif > 0 && sinif < 13;

        if(sonuc== false){
            System.out.println("Sisteme giriş yapmak için sınıfnız 1 ve 12 arası olmalıdır.");
        }

        if(sinif==1 || sinif==2 ||   sinif==3 || sinif== 4){
            System.out.println("İlkokula gidiyorsunuz");
        }
        else if(sinif== 5 || sinif== 6 || sinif== 7 || sinif== 8) {
            System.out.println("Ortaokula gidiyorsunuz.");
        }
        else{
            System.out.println("Liseye gidiyorsunuz.");
        }
    }
}