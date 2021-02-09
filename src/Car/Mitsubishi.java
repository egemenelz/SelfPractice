package Car;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders) {
        super(cylinders, "Mitsubishi");
    }


    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}
