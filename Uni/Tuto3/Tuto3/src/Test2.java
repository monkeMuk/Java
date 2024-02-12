import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) throws Exception {
        // Loop perimeter request

        int loop = 2;

        // Initilize arrays

        ArrayList subGradeList = new ArrayList();
        ArrayList subGPAList = new ArrayList();



        // create for loop

        for(int i = 1; i<=loop;i++)
        {
            Scanner subGradeReq = new Scanner(System.in);
            System.out.print("Subject "+i+" grade :");
            String subGradeInput = subGradeReq.next();
            
            subGradeList.add(subGradeInput);

            if(subGradeInput.equals("AA"))
            {
                subGPAList.add(4.00);
            }

            
            
        } 

        System.out.println(subGradeList);
        System.out.println(subGPAList);

    }
}

