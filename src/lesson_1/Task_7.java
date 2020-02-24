package lesson_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Enter angle values: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        if (a + b < 180) {
            System.out.println("1. True");
        } else System.out.println("1. False");
        if (a==90 || b==90 || a+b==90){
            System.out.println("2. True");
        }
        else System.out.println("2. False");
    }
}