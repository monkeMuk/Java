//213022801
//Adli Mukhriz bin Mohammad Firuz
// Calorie intake calculator

import java.util.Scanner;

public class Mukhriz_Tut2 {
    public static void main(String[] args) throws Exception {


        
        Scanner nameReq = new Scanner(System.in);
        System.out.print("Name:   ");
        String nameInput = nameReq.nextLine();

        System.out.println("Hi "+nameInput+" and Welcome to the My Calorie Counter System\n");

        System.out.println("*************************");
        System.out.println("Calorie Needs Per Day");
        System.out.println("*************************\n");

        // BMR = (10*weight)+(6.25*height)-(5*age)+5
        // S = BMR*1.2
        // L = BMR*1.375


        // S/L Request 
        Scanner activityReq = new Scanner(System.in);   
        System.out.print("Are you a sedentary or a light exercise person(1 for S/2 for L)   ");
        int activityInput = activityReq.nextInt();

        // Weight/Height/Age Request
        Scanner weightReq = new Scanner(System.in);
        System.out.print("Weight  : ");
        int weightInput = weightReq.nextInt();

        Scanner heightReq = new Scanner(System.in);
        System.out.print("Height  : ");
        int heightInput = heightReq.nextInt();

        Scanner ageReq = new Scanner(System.in);
        System.out.print("Age  :    ");
        int ageInput = ageReq.nextInt();

        //calculate BMR

        double BMR = (10*weightInput)+(6.25*heightInput)-(5*ageInput)+5;
        double newBMR = BMR;

        if(activityInput == 1)
        {
            newBMR = BMR*1.2;
        }
        if(activityInput == 2)
        {
            newBMR = BMR*1.375;
        }



        System.out.println("Your BMR is "+BMR);
        System.out.println(nameInput+", your  calorie needs per day is "+newBMR);


        Scanner mealNumReq = new Scanner(System.in);
        System.out.print("How many meals have you had today?    :");
        int mealNumInput = mealNumReq.nextInt();

        int totalCalorieIntake = 0;

        for(int i = 1; i<=mealNumInput; i++)
        {
            System.out.println("\nMeal #"+(i));

            Scanner calorieIntakeReq = new Scanner(System.in);
            System.out.print("Calories taken    :");
            int caloriIntakeInput = calorieIntakeReq.nextInt();

            totalCalorieIntake += caloriIntakeInput;

            System.out.print("Total calories taken "+ totalCalorieIntake);

            double calsLeft = newBMR - totalCalorieIntake;

            if(calsLeft >= 0)
            {
                calsLeft = newBMR - totalCalorieIntake;
                System.out.print("\nYou have "+calsLeft+" calories left");
            }
            else if(calsLeft < 0)
            {
                calsLeft = totalCalorieIntake - newBMR;
                System.out.print("\nYou have exceeded "+calsLeft+" calories from the calorie needs");
            }
        }
    }
}
