package by.epam.student.khartanovich.cycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

public class Task7 {
    public static void main(String[] args) {
        int m;
        int n;

        m = enterFromConsole("m >> ");
        n = enterFromConsole("n >> ");

        for (int i = m + 1; i < n; i++)
            for (int j = 2; j < i; j++)
                if (i % j == 0)
                    System.out.println("Делитель числа " + i + ": " + j);
    }

    public static int enterFromConsole(String message) {
        @SuppressWarnings("resourse")
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.print(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print(message);
        }
        value = scanner.nextInt();

        return value;
    }
}
