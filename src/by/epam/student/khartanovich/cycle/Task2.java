package by.epam.student.khartanovich.cycle;

import java.util.ArrayList;
import java.util.List;

/*
Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task2 {
    public static void main(String[] args) {
        int a = -20;
        int b = 20;
        int h = 2;
        int x;

        System.out.print("Значения функции на отрезке [" + a + ", " + b + "] c шагом " + h + ": ");

        for (x = a; x <= b; x += h) {
            if (x > 2)
                System.out.print(x + " ");
            else
                System.out.print(-x + " ");
        }
    }
}