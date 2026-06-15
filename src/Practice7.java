public class Practice7 {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 2020, 4);
        Motorcycle moto = new Motorcycle("Yamaha", 2018);

        car.start();
        moto.start();
    }
}

abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public void start() {
        System.out.println("Транспортное средство заведено");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void start() {
        System.out.println("Автомобиль " + brand + " заведён");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, int year) {
        super(brand, year);
    }
    @Override
    public void start() {
        System.out.println("Мотоцикл " + brand + " заведён");
    }
}