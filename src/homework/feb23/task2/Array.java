package homework.feb23.task2;

import java.util.Arrays;

/**
 * Дан массив из N целых чисел и целое число K , найдите количество пар элементов в массиве, сумма которых равна K.
 * Пример 1:
 * Вход:
 * N = 4, K = 6
 * arr[] = {1, 5, 7, 1}
 * Вывод: 2 пары чисел
 * Объяснение:
 * arr[0] + arr[1] = 1 + 5 = 6
 * arr[1] + arr[3] = 5 + 1 = 6.
 * <p>
 * Пример 2:
 * Вход:
 * N = 4, К = 2
 * arr[] = {1, 1, 1, 1}
 * Выход: 6 пар чисел
 */
public class Array {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 5, 7, 1,};
        sumOfNumbers(arr1, 6);

        int[] arr2 = new int[]{1, 1, 1, 1,};
        sumOfNumbers(arr2, 2);

        int[] arr3 = new int[]{2, 5, 8, 1, 6, 3, 4, -2, -1, 3};
        sumOfNumbers(arr3, 3);

        int[] arr4 = new int[]{2, 2, 3, 4, 5, 1, -2, -1, 2};
        sumOfNumbers(arr4, 12);
    }

    public static void sumOfNumbers(int[] array, int k) {
        System.out.println("Массив: " + Arrays.toString(array) + "\nЧисло k: " + k);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == k) {
                    counter++;
                    System.out.println(array[i] + " + " + array[j] + " = " + k);
                }
            }
        }
        System.out.println("Количество пар: " + counter + "\n");
    }
}
