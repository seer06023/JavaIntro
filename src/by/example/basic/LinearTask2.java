package by.example.basic;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((b+sqrt(b^2 + 4ac)) / 2a) - ca^3 + b^-2
*/


import java.util.Scanner;

public class LinearTask2 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double z;

        System.out.println("Enter a, b, c: ");
        Scanner in = new Scanner(System.in);

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - (Math.pow(a, 3)) * c + Math.pow(b, -2);

        System.out.println("z = " + z);

    }
}
