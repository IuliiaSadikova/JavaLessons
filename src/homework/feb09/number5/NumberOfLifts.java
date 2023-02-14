package homework.feb09.number5;

import java.util.Random;

/*
 * сломанный лифт
 * лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
 Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подьеме лифт превысил колличество
  этажей, то считается что лифт поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.
 *
 * Пример:
 * Ввод:
 * H = 200, N = 50, M = 1
 * Ответ: 5
 * Объяснение:
 * Первый подьем: 50 - 1 = 49
 * Второй подьем: 49 + 50 - 1 = 98
 * Третий подьем: 98 + 50 - 1 = 147
 * Четвертый подьем: 147 + 50 - 1 = 196
 * Пятый подьем: выйти за пределы H.
 *
 * реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
 */
public class NumberOfLifts {
    public static void main(String[] args) {
        Random random = new Random();

        int floors = 10;
        System.out.println("Total number of floors: " + floors);

        int floorsUp = random.nextInt(2, 10);
        System.out.println("Number of floors up: " + floorsUp);

        int floorsDown = random.nextInt(1, floorsUp) - 1;
        System.out.println("Number of floors down: " + floorsDown);

        int number = numberOfLifts(floors, floorsUp, floorsDown);
        System.out.println("Your number of lifts: " + number);
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown){
        int oneLift = stepUp - stepDown;
        int totalLifts = floor / oneLift;
        if (oneLift * totalLifts < floor) {
            return totalLifts + 1;
        } else {
            return totalLifts;
        }
    }
}
