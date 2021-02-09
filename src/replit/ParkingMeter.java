package replit;

public class ParkingMeter {
    private int timeLeft, maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
        timeLeft = 0;

    }
    public int getTimeLeft(){
        return timeLeft;
    }

    public boolean add(int value) {
        if (value == 25){
            timeLeft += 30;
            if (timeLeft > maxTime){
                timeLeft-=30;
                return false;
            }else{
                return true;
            }
        }return false;
    }

    public void tick() {
        while (this.timeLeft > 5) {
            this.timeLeft -= 1;
        }
    }

    public boolean isExpired() {
        if (this.timeLeft == 0) {
            return true;
        }
        return false;
    }
}

class main {
    public static void main(String[] args) {
        ParkingMeter parkingMeter = new ParkingMeter(50);

        System.out.println(parkingMeter.add(20));
        System.out.println(parkingMeter.getTimeLeft());
        System.out.println(parkingMeter.add(25));
        System.out.println(parkingMeter.getTimeLeft());
        System.out.println(parkingMeter.add(25));
        System.out.println(parkingMeter.getTimeLeft());
        parkingMeter.tick();
        System.out.println(parkingMeter.getTimeLeft());
        System.out.println(parkingMeter.isExpired());


    }
}
