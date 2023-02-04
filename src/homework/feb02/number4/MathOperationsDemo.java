package homework.feb02.number4;

public class MathOperationsDemo {
    public static void main(String[] args) {
        MathOperations MathOperations = new MathOperations();
        int a = 9;
        int b = 2;

        int resultOfAddition = MathOperations.addition(a,b);
        System.out.println(resultOfAddition);

        int resultOfSubtraction = MathOperations.subtraction(a,b);
        System.out.println(resultOfSubtraction);

        int resultOfMultiplication = MathOperations.multiplication(a,b);
        System.out.println(resultOfMultiplication);

        double resultOfDivision = MathOperations.division(a,b);
        System.out.println(resultOfDivision);



    }


}
