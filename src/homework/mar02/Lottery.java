package homework.mar02;

import java.util.Random;
import java.util.Scanner;

/**
 * реализовать простую лотерею
 * Т.З
 * создать класс для лотереи (подумать над названием)
 * добавить переменные для выигрышных номеров (5 номеров) (подумать над названием метода)
 * ограничить игровые номера от 1 до 50
 * создать метод который рандомально сетит в переменные выигрышные номера
 * создать метод, который принимает 5 номеров в аргументах и проверяет их на выигрыш, и печатает все выигранные
 * номера
 * в отдельном классе Test, в методе main протестировать работу лотереи. (можно использовать Сканнер для ввода или
 * хардкодом передать номера в метод лотереи)
 */
public class Lottery {
    int[] winningNumbers = new int[5];

    public int[] generateWinNumbers() {
        Random random = new Random();
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = random.nextInt(1, 51);
        }
        return winningNumbers;
    }

    public int[] getWinNumbers(int[] playerNumbers) {
        int counter = 0;
        for (int i = 0; i < playerNumbers.length; i++) {
            for (int j = 0; j < winningNumbers.length; j++) {
                if (playerNumbers[i] == winningNumbers[j]) {
                    counter++;
                }
            }
        }
        int[] matchedNumbers = new int[counter];

        int matchedNumIndex = 0;
        for (int i = 0; i < playerNumbers.length; i++) {
            for (int j = 0; j < winningNumbers.length; j++) {
                if (playerNumbers[i] == winningNumbers[j]) {
                    matchedNumbers[matchedNumIndex] = winningNumbers[j];
                    matchedNumIndex++;
                }
            }
        }
        return matchedNumbers;
    }
}




