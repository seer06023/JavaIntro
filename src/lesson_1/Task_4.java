package lesson_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Enter real number (ddd.mmm)");
        Scanner in = new Scanner(System.in);

        double b = Double.parseDouble(in.nextLine());
        double c = (int) b / 1000.0;
        double result = ((b * 1000) % 1000) + c;

        System.out.println(result);
    }
}
