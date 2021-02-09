package Car;

public class Main {
    public static void main(String[] args) {

        Ford ford = new Ford(4);
        Holden holden = new Holden(6);
        Mitsubishi mitsubishi = new Mitsubishi(8);

        ford.startEngine();
        holden.accelerate();
        mitsubishi.brake();

        System.out.println("========================================================");
        System.out.println(ford);
        System.out.println(holden);
        System.out.println(mitsubishi);
    }
}
