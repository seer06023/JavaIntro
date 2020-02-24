package by.example.basic;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
*/

import java.util.Scanner;

public class LinearTask5 {
    public static void main(String[] args) {

        String hourStr;
        String minStr;
        int seconds;
        int hours;
        int minutes;

        System.out.println("Enter time in seconds:");
        Scanner in = new Scanner(System.in);

        seconds = in.nextInt();

         hours = seconds / 3600;
        if (hours < 10) {
            hourStr =  "0" + hours;
        }
        else {
            hourStr = "" + hours;
        }


        minutes = (seconds % 3600) / 60;
        if (minutes < 10){
            minStr = "0" + minutes;
        }
        else {
            minStr = "" + minutes;
        }


        seconds = seconds % 60;


//        String hms = String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60);
        System.out.println("Time in HH:MM:SS format: ");
        System.out.println(hourStr + ":" + minStr + ":" + seconds);
    }
}
