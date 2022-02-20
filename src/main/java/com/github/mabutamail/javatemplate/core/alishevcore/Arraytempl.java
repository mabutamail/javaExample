package com.github.mabutamail.javatemplate.core.alishevcore;

import java.util.Arrays;

public class Arraytempl {
    public static void main(String[] args) {
        int[] z = new int[3];
        System.out.println("zzzzzzzzzzzzzzzzzz " + Arrays.toString(z));
        System.out.println("zzzzzzzzzzzzzzzzzz " + z[2]);
        int[] m = {1, 99, 3, 4, 5, 6, 7, 8, 9, 0};
        int k = 0;
        System.out.println(m.length);
        System.out.println(Arrays.stream(m).max());
        System.out.println(Arrays.toString(m));
        System.out.println(m[3]);
        for (int i : m) {
            System.out.println("foreach " + k + " " + i + " ==== ");
            k++;
        }
        Arrays.sort(m);
        System.out.println("=============== " + Arrays.toString(m));

        int[][] b = {{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};
        System.out.println(Arrays.deepToString(b));

        int[] c = new int[10];
        c[9] = 1235999999;
        System.out.println(c[9]);
        System.out.println("fffffffffffffff " + c.length);

        String[] seasons1 = {"Winter", "Spring", "Summer", "Autumn"};
        System.out.println("======================= " + seasons1.length);

        String[] seasons = new String[4]; /* объявили и создали массив. Java выделила память под массив из 4 строк, и сейчас в каждой ячейке записано значение null (поскольку строка — ссылочный тип)*/
        System.out.println(seasons.length);
        seasons[0] = "Winter"; /* в первую ячейку, то есть, в ячейку с нулевым номером мы записали строку Winter. Тут мы получаем доступ к нулевому элементу массива и записываем туда конкретное значение  */
        seasons[1] = "Spring"; // проделываем ту же процедуру с ячейкой номер 1 (второй)
        seasons[2] = "Summer"; // ...номер 2
        seasons[3] = "Autumn"; // и с последней, номер 3

    }
}
