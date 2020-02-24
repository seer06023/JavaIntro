package by.example.basic;

/*
Найти max{min(a, b), min(c, d)}
*/

import java.util.Scanner;

public class BranchTask2 {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c, d: ");
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();

        double result = Math.max((Math.min(a, b)), (Math.min(c, d)));

        System.out.println("max{min(a, b), min(c, d)} = " + result);
    }
}
