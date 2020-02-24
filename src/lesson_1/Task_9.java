package lesson_1;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Enter coordinates:");
        Scanner in = new Scanner(System.in);

        double ax = in.nextDouble();
        double ay = in.nextDouble();

        double bx = in.nextDouble();
        double by = in.nextDouble();

        double cx = in.nextDouble();
        double cy = in.nextDouble();
        double prec = 1e-20;

        if (Math.pow(((cx - ax) / (bx - ax) - (cy - ay) / (by - ay)), 2) <= prec) {
            System.out.println("True");
        } else System.out.println("False");
    }
}
