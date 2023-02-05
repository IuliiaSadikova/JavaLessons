package homework.feb02.number7;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        UserInputNumber userInputNumber = new UserInputNumber();
        System.out.println("Введите трёхзначное число: ");
        int userInputNum = userInputNumber.threeDigitNum();
        int firstDigit = userInputNum / 100;
        int secondDigit = (userInputNum - (firstDigit * 100)) / 10;
        int thirdDigit = userInputNum - (firstDigit * 100) - (secondDigit * 10);
        System.out.println("Первая цифра вашего числа: " + firstDigit);
        System.out.println("Вторая цифра вашего числа: " + secondDigit);
        System.out.println("Третья цифра вашего числа: " + thirdDigit);
    }
}
