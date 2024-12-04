import java.util.Scanner;

public class EmailPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email;
        String password;

            for(int i=1; i<=3; i++){
                System.out.println("Your email:");
                email = input.nextLine();
                input.nextLine();

                System.out.println("Password:");
                password = input.nextLine();

                if(email.contains("@gmail.com")&&password.length()==6){
                    System.out.println("Succesfull login");
                    break;
                }

                System.out.println("Try again. Your email must contain '@gmail.com' and your password must be 6 characters long");

            }
        }
    }
