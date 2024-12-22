import java.util.Scanner;
import java.util.ArrayList;

public class secondOOPHW {

    public static void main(String[] args){
        ArrayList<Kisi> yolculist = new ArrayList<>();
        ArrayList<Kisi> soforlist = new ArrayList<>();
        Scanner a = new Scanner(System.in);
        Yolcu yolcu1 = new Yolcu("Ayşe", "Öğrenci", 15);
        Sofor sofor1 = new Sofor("Mehmet", 45, 6, 100);
        yolculist.add(yolcu1);
        soforlist.add(sofor1);

        System.out.println("Yolcu Girişi Yapmak İstermisiniz? (Evet/Hayır)");
        String giris = a.nextLine();
        System.out.println("Sofor girişi yapacakmısınız? (Evet/Hayır)");
        String sgiris = a.nextLine();

        if(giris.equalsIgnoreCase("Evet")){
            System.out.println("Kaç yolcu girişi yapmak istersiniz?");
            int yolcuadet = a.nextInt();
            for(int i=0; i<yolcuadet; i++){
                a.nextLine();
                System.out.println("Yolcu İsmi:");
                String isim = a.nextLine();

                System.out.println("Yolcunun Akbil Türü:");
                String tur = a.nextLine();

                System.out.println("Yolcu Yaşı:");
                int yas = a.nextInt();

                Yolcu newyolcu = new Yolcu(isim, tur, yas);
                yolculist.add(newyolcu);
            }
        }

        if(sgiris.equalsIgnoreCase("Evet")){
            System.out.println("Kaç şöför girişi yapmak istersiniz?");
            int soforadet = a.nextInt();
            for(int e=0; e<soforadet; e++){
                a.nextLine();
                System.out.println("Şöför İsmi:");
                String isim = a.nextLine();

                System.out.println("Şöför Yaşı:");
                int yas = a.nextInt();

                System.out.println("Şöför Çalışma Saati:");
                int calismasaati = a.nextInt();

                System.out.println("Saatlik Maaş:");
                int saatlikmaas = a.nextInt();

                Sofor newsofor = new Sofor(isim, yas, calismasaati, saatlikmaas);
                soforlist.add(newsofor);
            }
        }

        System.out.println("Girişi yapılan şöförlerin ve yolcuların bilgileri:");

        for(Kisi s : yolculist){
            if (s instanceof Yolcu){
                Yolcu yolcu = (Yolcu) s;
            System.out.println("Yolcu İsmi: " + yolcu.getİsim());
            System.out.println("Yolcu Yaşı: " + yolcu.getYas());
            System.out.println("Yolcu Türü: " + yolcu.getTur());
            System.out.println("---------------------");
             }
            }


            for(Kisi s : soforlist){
                if (s instanceof Sofor) {
                    Sofor sofor = (Sofor) s;
                System.out.println("Şöför İsmi: " + sofor.getİsim());
            System.out.println("Şöför Yaşı: " + sofor.getYas());
            System.out.println("Şöförün Maaşı: " + sofor.SoforMaas());
            System.out.println("---------------------");
             }
            }

        }
    }

    

