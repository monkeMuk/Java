public class LecturerSub extends PersonSuperclass{

    private String expertise;
    private String department;
    private double salary;

    public LecturerSub(String name, String icno, String hpno, String address, String expertise, String department, double salary)
    {   
        super(name,icno,hpno,address);//calling the superclass constuctor
        this.expertise = expertise;
        this.department = department;
        this.salary = salary;
    }

    public String getExpertise() {
        return expertise;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void Display()
    {   
        super.Display();
        System.out.println("Expertise   \t:"+expertise);
        System.out.println("Department  \t:"+department);
        System.out.println("Salary   \tøº:"+salary);
    }

    
}
