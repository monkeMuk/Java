public class StudentSub extends PersonSuperclass {
    
    private String stuID;
    private String course;
    private String sem;


    public String getStuID() {
        return stuID;
    }
    public String getCourse() {
        return course;
    }
    public String getSem() {
        return sem;

    }
    public void setStuID(String stuID) {
        this.stuID = stuID;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setSem(String sem) {
        this.sem = sem;
    }
    public StudentSub(String name, String icno, String hpno, String address, String stuID, String course, String sem) {
        super(name, icno, hpno, address);
        this.stuID = stuID;
        this.course = course;
        this.sem = sem;
    }

    public void Display()
    {   
        super.Display();
        System.out.println("Student ID   :"+stuID);
        System.out.println("Course   :"+course);
        System.out.println("Sem   :"+sem);
    }

    

    
    
}
