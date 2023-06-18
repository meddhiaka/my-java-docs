public class Vehicle {
    private String brand;
    private int age;

    public Vehicle(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    public void start() {
        System.out.println("starting the vehicle " + brand + " with the age of " + age);
    }

    public void stop() {
        System.out.println("stopping the vehicle " + brand + " with the age of " + age);
    }

    public void DisplayBrandAndAge() {
        System.out.println("brand: " + brand + " and age: " + age);
    }
}

// public class Main {
// public static void main(String[] args) {
// Vehicle a = new Vehicle("Mazda", 15);
// a.start();
// a.stop();
// a.DisplayBrandAndAge();
// }
// }