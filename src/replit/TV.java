package replit;

public class TV {
    private int channel = 1, volumeLevel = 1;
    private boolean on = false;
    private String brand;

    public TV() {
        brand = "undefined";
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getChannel() {
        return channel;
    }

    public String getBrand() {
        return brand;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel>0 && volumeLevel<8 && isOn())
            this.volumeLevel = volumeLevel;
        else
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }

    public void setChannel(int channel) {
        if (channel <= 0 || channel > 120) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
        this.channel = channel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int channelUp() {

        return channel ++;
    }

    public int channelDown() {

        return channel --;
    }

    public int volumeUp() {

        return volumeLevel ++;
    }

    public int volumeDown() {

        return volumeLevel --;
    }

    public boolean isOn() {
        return on;
    }

     public void turnOn(){
        if (on) {
            System.out.println("TV is already ON");
        }else{
           on = true;
        }


    }

    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        }else{
           on = false;
        }

    }

}
class main4{
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.isOn());
        tv.turnOn();
        System.out.println(tv.isOn());
        tv.turnOn();
        System.out.println(tv.isOn());
    }
}
