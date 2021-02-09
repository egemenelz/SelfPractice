package replit;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV("Samsung");
        System.out.println(tv1.isOn());
        tv1.turnOn();
        System.out.println(tv1.isOn());
        tv1.turnOff();
    }
}
