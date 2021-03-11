package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Scientific Calculator-DevOps, Choose from below operations");
            System.out.print("Press 1 for Power function - x^b\nPress 2 for Square root function - √x\nPress 3 for Factorial function - x!\nPress 4 for Natural logarithm (base е) - ln(x)\n" +
                    "Press any other key to exit\n Please enter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {
                System.out.print("Enter the first number : ");
                number1 = scanner.nextDouble();
                number2 = 1;
                if(choice==1){
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                }
            } catch (InputMismatchException error) {
                logger.error("Input is invalid, please enter a number");
                return;
            }
            switch (choice) {
                case 1:
                    // do Power function - x^b
                    System.out.println("Power function result is : " + calculator.power(number1, number2));
                    break;
                case 2:
                    // do Square root function - √x
                    System.out.println("Square root function result is : " + calculator.squareroot(number1));
                    break;
                case 3:
                    // do Factorial function - x!
                    System.out.println("Factorial function result is : " + calculator.factorial(number1));
                    break;
                case 4:
                    // do Natural logarithm (base е) - ln(x)
                    System.out.println("Natural logarithm (base е) result is : " + calculator.naturallog(number1));
                    break;
                default:
                    System.out.println("Exiting");
                    return;
            }
        } while (true);
    }


    public double power(double number1, double number2) {
        logger.info("[Power function] - " + number1 + ", " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - Power function] - " + result);
        return result;
    }

    public double squareroot(double number1) {
        logger.info("[Square root function] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - Square root function] - " + result);
        return result;
    }


    public double factorial(double number1) {
        logger.info("[Factorial function] - " + number1);
        int i,result=1;
        for(i=1;i<=number1;i++){
            result=result*i;
        }
        logger.info("[RESULT - Factorial function] - " + result);
        return result;
    }

    public double naturallog(double number1) {
        logger.info("[Natural logarithm (base е)] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - Natural logarithm (base е)] - " + result);
        return result;
    }
}
