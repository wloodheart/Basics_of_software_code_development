package by.epam.student.khartanovich.linenearProgram;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

public class Task5 {
    public static void main(String[] args) {
        int t = 10000;
        int h = t / 3600;
        int m = (t - 3600 * h) / 60;
        int s = t - 3600 * h - 60 * m;

        System.out.println(h + "ч " + m + "мин " + s + "c");
    }
}
