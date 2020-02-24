package by.example.basic;
/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/

import java.util.Scanner;

public class LinearTask4 {
    public static void main(String[] args) {

        double b;
        double c;
        double result;

        System.out.println("Enter real number (ddd.mmm)");
        Scanner in = new Scanner(System.in);

         b = in.nextDouble();
         c =  (int)b / 1000.0;
         result = ((b * 1000) % 1000) + c;

        System.out.println(result);
    }
}
