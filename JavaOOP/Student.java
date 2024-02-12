import java.util.*;

public class Student
{
    public static void main(String[] args) 
    {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name =kb.nextLine();

        System.out.println("Enter id: ");
        int id =kb.nextInt();

        System.out.println("Enter program: ");
        String program =kb.nextLine();

        System.out.println("Enter cgpa: ");
        Double cgpa =kb.nextDouble();

        System.out.println("Enter sem: ");
        int sem =kb.nextInt();

        System.out.println();;

        StudentClass S1 = new StudentClass(name,id,program,cgpa,sem);
        S1.setProgram("diplomain IT");

        S1.Print();        



    }
}
