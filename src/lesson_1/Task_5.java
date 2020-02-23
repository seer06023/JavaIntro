package lesson_1;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Enter time in seconds:");
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();

        String hms = String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60);
        System.out.println("Time in HH:MM:SS format: " + hms);
    }
}
