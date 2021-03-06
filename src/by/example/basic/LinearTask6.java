package by.example.basic;

/*
Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области,
и false — в противном случае:
*/

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class LinearTask6 {
    public static void main(String[] args) {
        System.out.println("Enter coordinates (x, y):");
        Scanner in = new Scanner(System.in);

        long x = in.nextLong();
        long y = in.nextLong();

        ValueRange xup = ValueRange.of(-2, 2);
        ValueRange yup = ValueRange.of(0, 4);

        ValueRange xdwn = ValueRange.of(-4, 4);
        ValueRange ydwn = ValueRange.of(-3, 0);

        if ((xup.isValidValue(x) && yup.isValidValue(y)) || (xdwn.isValidValue(x) && ydwn.isValidValue(y))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
