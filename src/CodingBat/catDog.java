package CodingBat;

public class catDog {
    public static void main(String[] args) {
        String str = "1cat1cadodog";
        System.out.println(catDog(str));
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        boolean isSame = cat == dog;
        return isSame;
    }
}
