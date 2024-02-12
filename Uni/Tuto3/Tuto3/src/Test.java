import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        // Loop perimeter request

        // Scanner loopPerimeterReq = new Scanner(System.in);
        // System.out.print("Enter number of subjects taken    :");
        // int loopPerimeterInput = loopPerimeterReq.nextInt();

        // // Initilize arrays

        // ArrayList subCodeList = new ArrayList();
        // ArrayList subNameList = new ArrayList();
        // ArrayList subGradeList = new ArrayList();
        // ArrayList subCreditList = new ArrayList();
        // ArrayList subGPAList = new ArrayList();


        // // create for loop

        // double GPA;

        // for(int i = 1; i<=loopPerimeterInput;i++)
        // {
        //     Scanner subCodeReq = new Scanner(System.in);
        //     System.out.print("Subject "+i+" code  :");
        //     String subCodeInput = subCodeReq.nextLine();
        //     subCodeList.add(subCodeInput);

        //     Scanner subNameReq = new Scanner(System.in);
        //     System.out.print("Subject "+i+" name  :");
        //     String subNameInput = subNameReq.nextLine();
        //     subNameList.add(subNameInput);

        //     Scanner subGradeReq = new Scanner(System.in);
        //     System.out.print("Subject "+i+" grade :");
        //     String subGradeInput = subGradeReq.nextLine();
        //     subGradeList.add(subGradeInput);

        //     Scanner subCreditReq = new Scanner(System.in);
        //     System.out.print("Subject "+i+" credit:");
        //     String subCreditInput = subCreditReq.nextLine();
        //     subCreditList.add(subCreditInput);

        //     // calculate GPA from grade

        //     if(subGradeInput.equals("A+")  || subGradeInput.equals("A"))
        //     {   
        //         subGPAList.add(4.00);
        //     }
        //     else if(subGradeInput.equals("A-"))
        //     {
        //         subGPAList.add(3.67);
        //     }
        //     else if(subGradeInput.equals("B+"))
        //     {
        //         subGPAList.add(3.33);
        //     }
        //     else if(subGradeInput.equals("B"))
        //     {
        //         subGPAList.add(3.00);
        //     }
        //     else if(subGradeInput.equals("B-"))
        //     {
        //         subGPAList.add(2.67);
        //     }
        //     else if(subGradeInput.equals("C+"))
        //     {
        //         subGPAList.add(2.33);
        //     }
        //     else if(subGradeInput.equals("C"))
        //     {
        //         subGPAList.add(2.00);
        //     }
        //     else if(subGradeInput.equals("C-"))
        //     {
        //         subGPAList.add(1.67);
        //     }
        //     else if(subGradeInput.equals("D+"))
        //     {
        //         subGPAList.add(1.33);
        //     }
        //     else if(subGradeInput.equals("D"))
        //     {
        //         subGPAList.add(1.00);
        //     }
        //     else if(subGradeInput.equals("F"))
        //     {
        //         subGPAList.add(0);
        //     }

        // } 
        


        System.out.println("Course Code\t\t\tCourse Name\t\t\t\t\tCredit\tGrade\tGradePoint");

        System.out.println("CSC1513\t\t\t\tProgramming Fundamentals\t\t\t4\tA\t4.0");
        System.out.println("MATH1022\t\t\tDiscrete Structure\t\t\t\t3\tA+\t4.0");
        System.out.println("LANG2604\t\t\tTechnical and Professional Communication3\t3\tB+\t3.33");


        for(int x = 0; x<loopPerimeterInput;x++)
        {
            String code = (String) subCodeList.get(x);
            String name = (String) subNameList.get(x);
            String grade = (String) subGradeList.get(x);
            String credit = (String) subCreditList.get(x);
            Double newGPA = (Double) subGPAList.get(x);

            System.out.println(""+code+"\t\t"+name+"\t\t\t\t"+credit+"\t"+grade+"\t"+newGPA);
        }
    }
}

//CSC1513                         Programming Fundamentals                                4      A4.0
//MATH1022                                Discrete Structure                              3      A4.0
//LANG2604                                Technical and Professional Communication