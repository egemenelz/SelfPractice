package Car;

public class Car {
    private final boolean engine;
    private int cylinders, wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public void startEngine() {
        System.out.println(name + " engine is starting.");
    }

    public void accelerate() {
        System.out.println(name + " is accelerating.");
    }

    public void brake() {
        System.out.println(name + " is braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}
