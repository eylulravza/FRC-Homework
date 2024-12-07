import java.util.Scanner;

public class email {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String email;
        //String google= @gmail.com;

        System.out.println("Lütfen email hesabınızı giriniz:");
        email = input.nextLine();

        if(email.endsWith("@gmail.com")) {
            System.out.println("Gmailiniz kabul edilmiştir.");
        }
        else{
            System.out.println("Lütfen x@gmail.com içeren hesap kullanın");
        }

    }
    
}
