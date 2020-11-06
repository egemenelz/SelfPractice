package replit;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 1;
        int treesize = 1;

        while(year <= 10){
            if (year < 4){
                System.out.println("year "+ year + " - growth 1 cm");
                System.out.println("tree size: "+treesize+"cm");
                year++;
                treesize++;
            }else{
                treesize++;
                System.out.println("year "+ year + " - growth 2 cm");
                System.out.println("tree size: "+treesize+"cm");
                treesize++;
                year++;
            }
        }

    }
}
