package replit;

public class SimpleRoomBooking {
    public static boolean simpleRoomBook (boolean isAvailable, int month, int day, int year){
        if (isAvailable && year == 2018){
            if (month == 7 && (day >= 1 && day <= 8)){
                return false;
            }else{
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(simpleRoomBook(true,7,7,2018));
    }
}
