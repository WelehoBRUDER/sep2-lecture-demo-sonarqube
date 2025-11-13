package calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Calculator.class.getName());
        Scanner sc = new Scanner(System.in);
        log.info("Enter the first number: ");
        double num1 = sc.nextDouble();
        log.info("Enter the second number: ");
        double num2 = sc.nextDouble();
        double addition = addNumbers(num1, num2);
        double subtraction = subtractNumbers(num1, num2);
        double multiplication = multiplyNumbers(num1, num2);
        double division = divideNumbers(num1, num2);
        log.info(() -> "addition: " + addition);
        log.info(() -> "subtraction: " + subtraction);
        log.info(() -> "multiplication: " + multiplication);
        log.info(() -> "division: " + division);
    }

    public static double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractNumbers(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplyNumbers(double num1, double num2) {
        return num1 * num2;
    }

    public static double divideNumbers(double num1, double num2) {
        return num1 / num2;
    }
}
