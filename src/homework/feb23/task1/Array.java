package homework.feb23.task1;

import java.util.Arrays;

/**
 * Дан массив размера N-1 , который должен содержать только целые числа в диапазоне от 1 до N .
 * Каждое число представлено в одном экземпляре, кроме одного числа. Найдите недостающий элемент.
 * Пример 1:
 * Вход:
 * N = 5
 * А[] = {1,2,3,5}
 * Ответ: 4
 * <p>
 * Пример 2:
 * Вход:
 * N = 10
 * А[] = {6,1,2,8,3,4,7,10,5}
 * Ответ: 9
 */
public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 5};
        elementSearch(array1);

        int[] array2 = new int[]{6, 1, 2, 8, 3, 4, 7, 10, 5};
        elementSearch(array2);

        int[] array3 = new int[]{1, 2, 3, 4, 5, 6, 7};
        elementSearch(array3);
    }

    public static void elementSearch(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
        Arrays.sort(array);
        int missingElement = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != (array[i] + 1)) {
                missingElement = array[i] + 1;
                break;
            }
        }
        if (missingElement == 0) {
            System.out.println("No missing numbers");
        } else {
            System.out.println("The lost number is: " + missingElement);
        }
        System.out.println();
    }
}




