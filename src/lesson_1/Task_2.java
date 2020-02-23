package lesson_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        System.out.println("Enter a, b, c: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double z = ((b + Math.pow(Math.pow(b, 2), 0.5)) / 2 * a) - (Math.pow(a, 3)) * c + Math.pow(b, -2);
        System.out.println("z = " + z);

    }
}
