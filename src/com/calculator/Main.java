package src.com.calculator;

import java.util.Scanner;

import src.com.calculator.operations.add.Add;
import src.com.calculator.operations.division.Division;
import src.com.calculator.operations.multiply.Multiply;
import src.com.calculator.operations.subtraction.Subtraction;

public class Main {
    
    public static void main(String[] args) {
        double firstTerm = 0;
        double secondTerm = 0; 
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("First term -> ");
        firstTerm = scanner.nextDouble();

        System.out.println("Second term -> ");
        secondTerm = scanner.nextDouble();

        printOperations(firstTerm, secondTerm);
    
    }

    public static void printOperations(double a, double b) {

        Add addOperation = new Add();

        System.out.println("Addition -> " + addOperation.add(a, b));

        Subtraction subtractionOperation = new Subtraction();

        System.out.println("Subtraction -> " + subtractionOperation.subtract(a, b));

        Multiply multiplyOperation = new Multiply();

        System.out.println("Multiply -> " + multiplyOperation.multiply(a, b));
        
        Division divisionOperator = new Division();

        System.out.println("Division -> " + divisionOperator.division(a, b));
    }
}
