package by.example.basic;
/*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
*/

import java.util.Scanner;

public class LinearTask1 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        System.out.println("Enter a, b, c:");
        Scanner in = new Scanner(System.in);

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        System.out.println("z = ((a - 3) * b / 2) + c = " );

        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }
}
