package by.epam.student.khartanovich.branching;

/*
Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */

public class Task1 {
    public static void main(String[] args) {
        int a = 30;
        int b = 61;

        if (a + b < 180) {
            if (180 - a - b == 90)
                System.out.println("Такой треугольник существует и он является прямоугольным.");
            else System.out.println("Такой треугольник существует но он не прямоугольный.");
        }
        else System.out.println("Такого треугольника не существует.");
    }
}
