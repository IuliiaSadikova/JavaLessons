package homework.feb02.number6;

public class ExtraCalories {
    public static void main(String[] args) {
        int pizza1Diameter = 24;
        int pizza2Diameter = 28;
        int caloriesPerSqCm = 40;
        double circle24 = pizza1Diameter * pizza1Diameter / 4.0 * Math.PI;
        double circle28 = pizza2Diameter * pizza2Diameter / 4.0 * Math.PI;
        double difference = circle28 - circle24;
        System.out.println("Your extra calories are : " + difference * caloriesPerSqCm);
    }

}
