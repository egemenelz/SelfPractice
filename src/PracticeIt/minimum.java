package PracticeIt;

public class minimum {
    public static void main(String [] args){
        min (3, -2, 7);
        min (19, 27, 6);
    }
    public static int min(int x, int y, int z){
        int min = Math.min(x, Math.min(y, z));
        System.out.println(min);
        return min;
    }
}
