package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float max = 0;
        float min = 10;
        float total = 0;
        float difficulty = 0f;
        float sum = 0f;


        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextFloat();
            if (score[i] < min) {
                min = score[i];
            }
            if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println("Enter difficulty:");
        difficulty = input.nextFloat();

        for (int i = 0; i < score.length; i++) {
            if (min != score[i]) {
                if (max != score[i]) {
                    sum += score[i];
                }
            }
        }
        if (difficulty >= 1.2 && difficulty <= 3.8) {
            total = sum * difficulty * 0.6f;
        }

        System.out.printf("Total: %2f", total);


    }
}
