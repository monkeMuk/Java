

public class Car extends Vehicle {
    
    private int doors;
    private int tyres;

    void drive(){
        System.out.println("car is driving");
    }

    public Car(int doors, int tyres){
        this.setDoors(doors);
        this.setTyres(tyres);
    }

    public int getDoors(){
        return doors;
    }

    public int getTyres(){
        return tyres;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setTyres(int tyres){
        this.tyres = tyres;
    }
}
