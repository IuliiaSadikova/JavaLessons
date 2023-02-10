package homework.feb09.number1;

import java.util.Scanner;

public class CanWalk {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        boolean isWeekend;
        boolean isRain;
        System.out.println("Is it weekend? (True or false)");
        isWeekend = question.nextBoolean();
        System.out.println("Is it rainy? (True or false)");
        isRain = question.nextBoolean();
        boolean canWalk;
        canWalk = isWeekend && !isRain;
        System.out.println("Can you walk? ");
        System.out.println(canWalk);
    }
}