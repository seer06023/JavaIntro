package lesson_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Enter x, y: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();

        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println("z = " + z);

    }
}
