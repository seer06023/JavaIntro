package by.example.basic;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
*/

import java.util.Scanner;

public class BranchTask1 {
    public static void main(String[] args) {
        System.out.println("Enter angle values: ");
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();

        if (a + b < 180) {
            System.out.println("Exist");
        }
        else {
            System.out.println("Not exist");
        }
        if (a==90 || b==90 || a+b==90){
            System.out.println("Rectangular");
        }
        else {
            System.out.println("Not Rectangular");
        }
    }
}