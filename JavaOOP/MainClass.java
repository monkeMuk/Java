import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<LecturerSub> LectList = new ArrayList<LecturerSub>();

        LectList.add(new LecturerSub("Adli Mukhriz", "21230217", "0121314213", "Kajang, Selangor", "Coding", "CompSci", 10000));
        

        for(int i = 0; i <LectList.size(); i++)
        {
            LectList.get(i).Display();
            System.out.println("");
        }
    }
}
