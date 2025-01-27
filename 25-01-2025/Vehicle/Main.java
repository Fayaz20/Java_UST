package Vehicle;

public class Main {
    public static void main(String []args){
        Vehicle car=new Car();
        Bike bike =new Bike();
        System.out.println("Initial speeds of car "+car.getSpeed());
        System.out.println("Initial speeds of bike "+bike.getSpeed());
        car.speedUp();
        bike.speedUp();
        System.out.println("Final speeds of car "+car.getSpeed());
        System.out.println("Final speeds of bike "+bike.getSpeed());
    }
}
