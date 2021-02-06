package by.epam.student.khartanovich.cycle;

/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};

        for (char temp : array) {
            System.out.println(temp + " -> " + (int)temp);
        }
    }
}
