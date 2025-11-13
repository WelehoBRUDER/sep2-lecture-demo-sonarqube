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

        log.info("Select the operation: \n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division");
        int operation = sc.nextInt();

        double result;

        if (operation == 1) {
            result = addNumbers(num1, num2);
        } else if (operation == 2) {
            result = subtractNumbers(num1, num2);
        } else if (operation == 3) {
            result = multiplyNumbers(num1, num2);
        } else if (operation == 4) {
            result = divideNumbers(num1, num2);
        } else {
            result = 0;
        }

        log.info(() -> "The result is: " + result);
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
