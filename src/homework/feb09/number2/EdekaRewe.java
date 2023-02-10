package homework.feb09.number2;

import java.util.Scanner;

public class EdekaRewe {

    public static void main(String[] args) {
        Scanner shopsScanner = new Scanner(System.in);
        boolean isEdekaOpen;
        boolean isReweOpen;
        System.out.println("Is Edeka open?");
        isEdekaOpen = shopsScanner.nextBoolean();
        System.out.println("Is Rewe open?");
        isReweOpen = shopsScanner.nextBoolean();
        Shops shops = new Shops();
        boolean canBuy = shops.canBuy(isEdekaOpen, isReweOpen);
        System.out.println("Я  могу купить еду, это " + canBuy);
    }
}
