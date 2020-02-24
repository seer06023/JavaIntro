package by.example.basic;

/*
Даны три точки А(x1, y1), В(x2, y2) и С(x3, y3). Определить, будут ли они расположены на одной прямой.
*/

import java.util.Scanner;

public class BranchTask3 {
    public static void main(String[] args) {

        System.out.println("Enter coordinates A(x1, y1), B(x2, y2), C(x3, y3):");
        Scanner in = new Scanner(System.in);

        double ax = in.nextDouble();
        double ay = in.nextDouble();

        double bx = in.nextDouble();
        double by = in.nextDouble();

        double cx = in.nextDouble();
        double cy = in.nextDouble();
        double prec = 1e-20;

        if (Math.pow(((cx - ax) / (bx - ax) - (cy - ay) / (by - ay)), 2) <= prec) {
            System.out.println("Points are on straight line");
        }
        else {
            System.out.println("Points are not on straight line");
        }
    }
}
