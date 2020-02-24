package lesson_1;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c, d: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        double result = Math.max((Math.min(a, b)), (Math.min(c, d)));
        System.out.println("Result = " + result);

    }
}
