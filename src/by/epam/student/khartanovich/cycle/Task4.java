package by.epam.student.khartanovich.cycle;

import static java.lang.Math.pow;

/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
    public static void main(String[] args) {
        long product = 1;

        for (int i = 1; i <= 200; i++)
            product *= pow(i, 2);

        System.out.println(product);
    }
}
