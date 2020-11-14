package replit;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        while(k < temps.length){
            total += temps[k];
            k++;
        }
        avgTemp = total/temps.length;
        System.out.println(avgTemp);
    }
}
