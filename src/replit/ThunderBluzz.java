package replit;

public class ThunderBluzz {
    public static boolean getThunderBlazz(boolean available, boolean gift, int ingredient1, int ingredient2, int ingredient3) {

        if (available || gift){
            return true;
        }else {
            if ((ingredient1 == 1 || ingredient1 == 3) && (ingredient2 == 2 || ingredient2 == 1) && (ingredient3 == 3 || ingredient3 == 2)) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(getThunderBlazz(true, false, 1, 2, 3));
    }
}
