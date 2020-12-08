package PracticeIt;

public class isSorted {
    public static boolean isSorted(double list[]) {
        if (list.length < 1){
            return false;
        }
        for (int i = 0; i < list.length-1 ; i++) {
            if (list[i] > list[i+1]){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        double list1[] = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

        System.out.println(isSorted(list1));
    }
}
