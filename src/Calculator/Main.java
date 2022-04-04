package Calculator;

public class Main {
    public static void main(String[] args) {
        Integer firstNumber = 2;
        Integer secondNumber = 3;

        System.out.println("Sum Result: "+ AddCalculation(firstNumber, secondNumber));
        System.out.println("Subtract  Result: "+ subtractCalculation(firstNumber, secondNumber));
        System.out.println("Multiply Result: "+ multiplyCalculation(firstNumber, secondNumber));
        System.out.println("Divide Result: "+ divideCalculation(firstNumber, secondNumber));

    }

    private static Integer AddCalculation(Integer firstNumber, Integer secondNumber){
        return firstNumber + secondNumber;
    }

    private static Integer subtractCalculation(Integer firstNumber, Integer secondNumber){
        return firstNumber - secondNumber;
    }

    private static Integer multiplyCalculation(Integer firstNumber, Integer secondNumber){
        return firstNumber * secondNumber;
    }

    private static Float divideCalculation(Integer firstNumber, Integer secondNumber){
        return firstNumber.floatValue() / secondNumber.floatValue();
    }
}
