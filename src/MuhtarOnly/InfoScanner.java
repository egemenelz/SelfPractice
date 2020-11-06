package MuhtarOnly;

import java.util.Scanner;

public class InfoScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Height ");
        double height = sc.nextDouble();
        System.out.print("Enter Your Shoe Size ");
        byte shoeSize = sc.nextByte();
        System.out.print("Are you wearing hat ");
        boolean isWearHat = sc.hasNextBoolean();

        double a = height;
        byte b = shoeSize;
        System.out.println("He/She is "+ a +" feet tall");
        System.out.println("His/Her shoe size is "+b);

        if (isWearHat){
            System.out.println("He/She is wearing a hat");
        }else{
            System.out.println("Not wearing a hat today");
        }
    }
}
