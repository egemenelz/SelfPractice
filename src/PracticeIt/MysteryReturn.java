package PracticeIt;

public class MysteryReturn {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        z = mystery(x, z, y);
        System.out.println(x+" "+y+" "+z);
        x = mystery(z,z,x);
        System.out.println(x+" "+y+" "+z);
        y = mystery(y,y,z);
        System.out.println(x+" "+y+" "+z);

        System.out.println(lastDigit(-947));
        System.out.println(largerAbsVal(-4,5,2));
    }
    public static int lastDigit(int number){
        number = number % 10;
        return Math.abs(number);
    }
    public static int largerAbsVal(int num1, int num2, int num3){
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        num3 = Math.abs(num3);
        int num4 = Math.max(num1 , num2);
        return Math.max(num3,num4);
    }
    public static int mystery(int z, int x, int y){
        z--;
        x = 2* y + z;
        y = x - 1;
        return x;

    }
}
