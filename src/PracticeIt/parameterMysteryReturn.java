package PracticeIt;

public class parameterMysteryReturn {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        double grade = 3.0;
        Math.round(grade);
        grade = Math.round(grade);
        double min = Math.min(grade , Math.floor(2.9));
        System.out.println(min);
        double floor = Math.floor(2.9);
        System.out.println(floor);
        double t = Math.pow(2, 4);
        t = Math.sqrt(64);
        System.out.println(t);

        int count = 25;
        Math.sqrt(count);

        System.out.println(count);
        int u = 7;
        int miin = Math.min(u,Math.min(3 ,-2));


        /*z = mystery(x,z,y);
        System.out.println(x + " " + y + " "+ z);
        System.out.println("============");
        x = mystery(z, z, x);
        System.out.println(x + " " + y + " " + z);*/

    }
    public static int mystery(int z, int x, int y){
        z--;
        x = 2 * y + z;
        y = x - 1;

        return x;
    }
}
