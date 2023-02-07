package homework.feb02.number3;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово с чётным количеством букв: ");
        String word = scanner.nextLine();
        System.out.println("Длина букв в вашем слове: " + word.length());

        System.out.println("Введите второе слово с чётным количеством букв: ");
        String word2 = scanner.nextLine();
        System.out.println("Длина букв в вашем слове: " + word2.length());

        String firstHalf = word.substring(0, word.length()/2);

        String secondHalf = word2.substring(word2.length()/2);

        System.out.println("Ваше новое слово: " + firstHalf + secondHalf);

    }
}
