package lesson_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c:");
        Scanner in = new Scanner(System.in);
        double a = in.nextFloat();
        double b = in.nextFloat();
        double c = in.nextFloat();
        System.out.println("a = " + a +"; b = " + b + "; c = " + c );

        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }
}
