package UdemyCourse;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigBags = bigCount * 5;
        int smallBags = smallCount * 1;
        goal = bigBags + smallBags;
        if (goal < bigBags + smallBags){
             goal = smallBags - 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
    }
}
