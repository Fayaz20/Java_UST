
package Poly;

public class Polyporphisim {


public static class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}


public static class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Bird chirps");
    }
}

public static class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myBird = new Bird(); // Animal reference but Bird object
        Animal myDog = new Dog(); // Animal reference but Dog object

        myAnimal.sound();
        myBird.sound();
        myDog.sound();
    }
}