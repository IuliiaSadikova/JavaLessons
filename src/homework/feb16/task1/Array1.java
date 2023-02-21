package homework.feb16.task1;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте массив из 8 случайных целых чисел из интервала [1;50]
 * Выведите массив на экран в строку
 * Замените каждый элемент с нечётным индексом на ноль
 * Снова выведете массив на экран на отдельной строке
 */
public class Array1 {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(1,50);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
