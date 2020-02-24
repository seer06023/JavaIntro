package by.example.basic;
/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 ((sin x + cos y) / (cos x - sin y)) * tg xy
*/

import java.util.Scanner;

public class LinearTask3 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        System.out.println("Enter x, y: ");
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();

        z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

        System.out.println("z = " + z);
    }
}
