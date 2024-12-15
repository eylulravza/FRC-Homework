import java.util.Scanner;

public class VizeFinalFonksiyon {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Vize:");
        int vize = a.nextInt();
        System.out.println("Final:");
        int finalnot = a.nextInt();

        sonNot(a, vize, finalnot);
    }

    public static void sonNot(Scanner a,int vize, int finalnot){
        double vize2 = vize*40/100;
        double final2 = finalnot*60/100;
        double not = vize2 + final2;
        System.out.println("Notunuz:" + not);
    }
    
}
