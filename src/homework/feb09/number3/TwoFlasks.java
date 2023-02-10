package homework.feb09.number3;

import java.util.Scanner;

public class TwoFlasks {

    public static void main(String[] args) {
        Scanner temperatureScanner = new Scanner(System.in);
        int temperatureLimit = 100;
        int temperature1, temperature2;
        System.out.println("Enter the temperature of first flask (above 100):");
        temperature1 = temperatureScanner.nextInt();
        System.out.println("Enter the temperature of second flask from 0 to 100:");
        temperature2 = temperatureScanner.nextInt();
        if (temperature1 > temperatureLimit && temperature2 < temperatureLimit){
            System.out.println("The device works correctly? " + true);
        } else {
            System.out.println("The device works correctly? " + false);
        }

    }
}