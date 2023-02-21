package homework.feb16.task3;

import java.util.Arrays;

/**
 * Работа с последовательностями
 * 1. Определить закономерность, согласно которой формируется та или иная числовая последовательность.
 * 2. Написать функцию, которая формирует первые N = 10 элементов данной последовательности в виде целочисленного
 * массива и выводит элементы массива на экран.
 * 1-я последовательность: 2,  4,  6,   8,  10…
 * 2-я последовательность: 1,  3,  5,   7,   9…
 * 3-я последовательность: 1,  4,  9,  16,  25…
 * 4-я последовательность: 1,  8, 27,  64, 125…
 * 5-я последовательность: 1, -1,  1,  -1,   1,  -1…
 * 6-я последовательность: 1, -2,  3,  -4,   5,  -6…
 * 7-я последовательность: 1, -4,  9, -16,  25….
 * 8-я последовательность: 1,  0,  2,   0,   3,   0,  4….
 * 9-я последовательность: 1,  2,  6,  24, 120, 720…
 * 10-я последовательность: 1,  1,  2,   3,   5,   8, 13, 21…
 */
public class ArraysOfSequences {
    public static void main(String[] args) {
        int[] arraySequence1 = sequence1();
        System.out.println("#1 " + Arrays.toString(arraySequence1));

        int[] arraySequence2 = sequence2();
        System.out.println("#2 " + Arrays.toString(arraySequence2));

        int[] arraySequence3 = sequence3();
        System.out.println("#3 " + Arrays.toString(arraySequence3));

        int[] arraySequence4 = sequence4();
        System.out.println("#4 " + Arrays.toString(arraySequence4));

        int[] arraySequence5 = sequence5();
        System.out.println("#5 " + Arrays.toString(arraySequence5));

        int[] arraySequence6 = sequence6();
        System.out.println("#6 " + Arrays.toString(arraySequence6));

        int[] arraySequence7 = sequence7();
        System.out.println("#7 " + Arrays.toString(arraySequence7));

        int[] arraySequence8 = sequence8();
        System.out.println("#8 " + Arrays.toString(arraySequence8));

        int[] arraySequence9 = sequence9();
        System.out.println("#9 "+ Arrays.toString(arraySequence9));

        int[] arraySequence10 = sequence10();
        System.out.println("#10 "+ Arrays.toString(arraySequence10));

    }

    public static int[] sequence1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2;
        }
        return array;
    }

    public static int[] sequence2() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 2 - 1;
        }
        return array;
    }

    public static int[] sequence3() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(i + 1, 2);
        }
        return array;
    }

    public static int[] sequence4() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(i + 1, 3);
        }
        return array;
    }

    public static int[] sequence5() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = -1;
            }
        }
        return array;
    }

    public static int[] sequence6() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = (i + 1) * (-1);
            } else {
                array[i] = i + 1;
            }
        }
        return array;
    }

    public static int[] sequence7() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = (int) Math.pow(i + 1, 2);
            } else {
                array[i] = ((int) Math.pow(i + 1, 2)) * (-1);
            }
        }
        return array;
    }

    public static int[] sequence8() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            } else {
                array[i] = i + 1;
            }
        }
        return array;
    }
    public static int[] sequence9 () {
        int[] array = new int[10];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] * (i + 1);
        }
        return array;
    }
    public static int[] sequence10 () {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
}



