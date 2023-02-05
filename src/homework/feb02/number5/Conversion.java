package homework.feb02.number5;

public class Conversion {

    public static void main(String[] args) {
        UserInputExchange userInputExchange = new UserInputExchange();
        double exchangeRateUsd = 1.091;
        System.out.println("Please enter your sum in EUR: ");
        double userInputEur = userInputExchange.userInputSum();

        System.out.println("Your sum in USD: " + userInputEur*exchangeRateUsd);
        }

}
