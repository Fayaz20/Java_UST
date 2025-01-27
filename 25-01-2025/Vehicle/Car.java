package Vehicle;

public class Car extends Vehicle{
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("The car speed is increased by 10 units");
    }
}
