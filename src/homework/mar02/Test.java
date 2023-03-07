package homework.mar02;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        while (true) {
            Lottery lottery = new Lottery();
            int[] winningNumbers = lottery.generateWinNumbers();

            int[] playerNumbers = getPlayerNumbers();

            System.out.println("Winning numbers: " + Arrays.toString(winningNumbers));

            int[] playerWinNumbers = lottery.getWinNumbers(playerNumbers);
            if (playerWinNumbers.length == 0) {
                System.out.println("You have no matched numbers in this round :(");
            } else
                System.out.println("Your winning number(s): " + Arrays.toString(playerWinNumbers));

            if (!oneMoreRound()) {
                break;
            }
        }
    }

    public static int[] getPlayerNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] playerNumbers = new int[5];
        System.out.println("Let's play Lottery! \nEnter 5 numbers from 1 to 50:");
        for (int i = 0; i < playerNumbers.length; i++) {
            playerNumbers[i] = scanner.nextInt();
        }
        return playerNumbers;
    }

    public static boolean oneMoreRound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Do you want to play another round?\n" + "y - yes\n"
                + "n - no"));
        char decision = scanner.nextLine().charAt(0);
        if (decision == 'n') {
            System.out.println("Thank you for the game! :)");
        }
        return decision == 'y';
    }
}
