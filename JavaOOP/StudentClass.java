
public class StudentClass 
    {

        //data private variables

        private String name;
        private String id;
        private String program;
        private double cgpa;
        private int sem;


        //constructor
        public StudentClass(String name, String id, String program, double  cgpa, int sem)
        {
            this.name = name;
            this.id = id;
            this.program = program;
            this.cgpa = cgpa;
            this.sem = sem;
        }

        //accessor method/ getter method
        public String getName()
        {
            return name;
        }

        public String getID()
        {
            return id;
        }

        public String getProgram()
        {
            return program;
        }

        public double getCgpa()
        {
            return cgpa;
        }

        public int getSem()
        {
            return sem;
        }

        public void Print()
        {
            System.out.println(name);
            System.out.println(id);
            System.out.println(program);
            System.out.println(cgpa);
            System.out.println(sem);

        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }

        public void setSem(int sem) {
            this.sem = sem;
        }

        //setter

        //overloading constructor

    }

