package com.kitcenter.app.classwork.lesson7;

import java.util.Random;

public class ArrayHomework {

    public static void arrayEven() {
        // массив из всех чётных чисел от 2 до 20

        int[] b = new int[10];
        int val = 2;
        int i;

        for (val = 2, i = 0; val <= 20; val += 2, i++) {
            b[i] = val;
            System.out.println(b[i]);
        }

        for (i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();

    }

    public static void arrayOdd() {
        //Создайте массив из всех нечётных чисел от 1 до 99,
        // выведите его на экран в строку,
        // затем этот же массив выведите на экран в другую строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

        int[] c = new int[50];
        int k, i;

        for (k = 1, i = 0; k <= 99; k += 2, i++) {
            c[i] = k;
            System.out.print(c[i] + " ");

        }
        System.out.println();

        for (i = 49; i >= 0; i--) {
            System.out.print(c[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public static void randomEvenCounter() {
        //Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        // Выведите массив на экран.
        // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

        int[] r = new int[15];
        Random random1 = new Random();
        int counter = 0;

        for (int i = 0; i <= 14; i++) {
            r[i] = random1.nextInt(10);
            System.out.print(r[i] + " ");

            if (r[i] % 2 == 0) {
                counter++;

            }
        }

        System.out.println();
        System.out.print(counter);
        System.out.println();

    }

    public static void randomMaxMin() {
        // Создайте массив из 15 случайных целых чисел из отрезка [0;999].
        // Выведите массив на экран.
        // Выведите минимальное и максимальное значение элементов массива
        int[] r2 = new int[15];
        Random random2 = new Random();
        int max = r2[0], min = r2[0];

        for (int i = 0; i <= 14; i++) {
            r2[i] = random2.nextInt(1000);
            System.out.print(r2[i] + " ");

        }

        for (int i = 0; i < 14; i++) {
            if (r2[i] > max) {
                max = r2[i];
            }
            if (r2[i] < min) {
                min = r2[i];
            }
        }
        System.out.println();
        System.out.println("Minimum number is " + min);
        System.out.println("Maximum number is " + max);
        System.out.println();
    }

    public static void arrayMatrix() {
        //Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
        // Вывести массив на экран.
        int[][] r3 = new int[8][5];
        Random random3 = new Random();
        int rows = 8;
        int columns = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                r3[i][j] = random3.nextInt(90 + 10);
                System.out.print(r3[i][j] + " ");
            }
            System.out.println();

        }


    }

    public static void allignRightBorder() {
        //*** Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [1;999].
        // Вывести массив на экран в виде матрицы, где в каждом столбце числа должны быть выравнены по правому краю столбца
        // (пример http://i.stack.imgur.com/paDBL.jpg)

        int[][] r4 = new int[8][5];
        Random random4 = new Random();
        int rows = 8;
        int columns = 5;

        for(int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                r4[i][j] = random4.nextInt(999+1);
                System.out.println();
            }
        }

    }
}



