import java.util.ArrayList;

import javax.swing.SpinnerDateModel;

public class exceptionHandling {

    public static void main(String[] args) throws Exception {
        
        try{
            int mul= 24*45;

            ArrayList numList = new ArrayList();
            numList.add(mul);
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("The argument is Illegal ");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The array index is out of bounds");
        }

    }
}

