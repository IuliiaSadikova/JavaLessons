package homework.feb16.task2;

import java.util.Arrays;
import java.util.Random;
/**
 * Создайте массив из 5 случайных целых чисел из интервала [10;99]
 * Выведите его на экран в строку.
 * Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class Array2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array));
        boolean isRised = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] >= array[i+1]) {
                isRised = false;
                break;
            }
        }
        if (isRised) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
