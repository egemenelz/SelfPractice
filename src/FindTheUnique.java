
public class FindTheUnique {
    class Chicken{}
    interface HenHouse{
        java.util.List<Chicken> getChickens();
    }


    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println();


        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while (count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch (y) {
                default:
                case 0:
                    x -= 1;
                    break;
                case 1:
                    x += 5;
            }
        }
        System.out.println(x);
    }

    public static String unique(String str) {
        String[] arr = str.split("");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count == 1) {
                result += arr[i];
            }
        }
        return result;
    }


}
