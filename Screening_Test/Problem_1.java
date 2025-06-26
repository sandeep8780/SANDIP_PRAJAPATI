package Screening_Test;

import java.util.Scanner;

class Calculator {
    double a;
    double b;
    String operation;


    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }


    public void calculate() {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
            case "/":
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();
        scanner.nextLine();


        System.out.print("Enter operation (add, subtract, multiply, divide or +, -, *, /): ");
        String operation = scanner.nextLine();


        Calculator calculator = new Calculator(a, b, operation);
        calculator.calculate();


    }
}
