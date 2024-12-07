import java.util.Random;

public class RandomSayi {
    public static void main(String[] args) {
        Random random1 = new Random();

        int Ciftsayi=0;
        int Teksayi=0;

        for( int i=0; i < 50; i++){
        int randomsayi = random1.nextInt(101);

            if (randomsayi % 2 == 0){
                Ciftsayi++;
            }
            else{
                Teksayi++;
            }
        }

        System.out.println("Çift Sayı Sayısı:" + Ciftsayi + "Tek Sayı Sayısı:" + Teksayi);

    }
}
