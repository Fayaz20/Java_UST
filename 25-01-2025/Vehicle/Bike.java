package Vehicle;

public class Bike extends Vehicle{
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("The bike speed is increased by 10 units");
    }
}
