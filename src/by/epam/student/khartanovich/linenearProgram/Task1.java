package by.epam.student.khartanovich.linenearProgram;

import java.util.Scanner;

/*
Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Task1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double z;

        a = enterFromConsole("a >> ");
        b = enterFromConsole("b >> ");
        c = enterFromConsole("c >> ");

        z = ((a - 3) * (double) b / 2) + c;

        System.out.println("z = " + z);
    }

    public static int enterFromConsole(String message) {
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
