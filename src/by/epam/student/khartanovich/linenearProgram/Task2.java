package by.epam.student.khartanovich.linenearProgram;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */


public class Task2 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double result;

        a = enterFromConsole("a >> ");
        b = enterFromConsole("b >> ");
        c = enterFromConsole("c >> ");

        result = (b + sqrt(pow(b, 2) + 4 * a * c)) / 2 * a - pow(a, 3) * c + pow(b, -2);

        System.out.println("Значение выражения = " + result);
    }

    public static double enterFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        double value;

        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print(message);
        }
        value = scanner.nextDouble();

        return value;
    }
}
