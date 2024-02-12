

public class Airport extends Place{

    private String name;
    private String location;
    private int capacity;

    //  constructor
    public Airport(String name, String location, int capacity)
    {
        this.setName(name);
        this.setLocation(location);
        this.setCapacity(capacity);
    
    }

    // getter
    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public int getCapacity(){
        return capacity;
    }

    // setter
    public void setName(String Name){
        this.name = name;
    }
    
    public void setLocation(String location){
        this.location = location;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}
