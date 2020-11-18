package replit;

public class CountApperance {
    public static int count_Apperance(String[] arr, String t) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String each = arr[i];
            if (t.equalsIgnoreCase(each)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        String[] arr = {"a", "foo", "bar", "foo", "bla"};
        String t = "foo";
        System.out.println(count_Apperance(arr,t));
    }
}
