import java.util.Scanner;
import java.util.ArrayList;


public class StudentOOP {
    public static void main(String[] args){
        ArrayList<Info> studentlist = new ArrayList<>();
        Scanner a = new Scanner(System.in);
        Info student = new Info("Eylül", "Female", 16, 10, 100, 90);
        System.out.println("Name of the student:" + student.getName());
        System.out.println("Gender of the student:" + student.getGender());
        System.out.println("Age of the student:" + student.getAge());
        System.out.println("Class number of the student:" + student.getClassno());
        System.out.println("Math Grade of the student:" + student.getMathgrade());
        System.out.println("Science Grade of the student:" + student.getSciencegrade());

        studentlist.add(student);

    

        System.out.println("How many students would you like to add?");
        int studentnumber= a.nextInt();
        a.nextLine();

       
            for(int e=0; e<studentnumber; e++){
            System.out.println("Name of the student you want to add:");
            String name = a.nextLine();
            

            System.out.println("Gender of the student you want to add:");
            String gender = a.nextLine();

            System.out.println("Age of the student you want to add:");
            int age = a.nextInt();

            System.out.println("Class number of the student you want to add:");
            int classno = a.nextInt();

            System.out.println("Math grade of the student you want to add:");
            int mathgrade = a.nextInt();

            System.out.println("Science grade of the student you want to add:");
            int sciencegrade = a.nextInt();

            a.nextLine();

            Info newStudent = new Info(name, gender, age, classno, mathgrade, sciencegrade);
            studentlist.add(newStudent);
     }

        System.out.println("All of the student informations:");
        for(Info s : studentlist){
            System.out.println("Name of the student:" + s.getName());
            System.out.println("Gender of the student:" + s.getGender());
            System.out.println("Age of the student:" + s.getAge());
            System.out.println("Class number of the student:" + s.getClassno());
            System.out.println("Math Grade of the student:" + s.getMathgrade());
            System.out.println("Science Grade of the student:" + s.getSciencegrade());
            System.out.println("---------------------");
        }
      
        
        
        
        
    }
}
