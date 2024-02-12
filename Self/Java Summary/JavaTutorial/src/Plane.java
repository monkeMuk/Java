public class Plane {
    
    // attributes
private String make;
private String airline;
private String model;
private int year;

    // constructor - allows the instantiated object to have its own variables
    public Plane(String make, String airline, String model, int year)
    {
        // "this" refers to the instaNtiated object whereas the right side refers to the parameters
        this.setMake(make);
        this.setAirline(airline);
        this.setModel(model);
        this.setYear(year);
    }
    
    // method
    void fly()
	{
        System.out.println(this.model + " can land here");
	}

    // getter - when an object is instantiated and the attribute called is private, use getter to unprivate it
    public String getMake(){
        return make; 
    }
    
    public String getAirline(){
        return airline ;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getYear(){
        return year;
    }

    //setter - 
    public void setMake(String make){
        this.make = make;
    }

    public void setAirline(String airline){
        this.airline = airline;
    }

    public void setModel(String model){
        this.model = model;
    }
    
    public void setYear(int year){
        this.year = year;
    }


}

