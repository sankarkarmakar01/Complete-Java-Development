package projects.CalculatorApp.SubClasses;

import projects.CalculatorApp.interfaces.CalculatorOperations;

public class Subtraction implements CalculatorOperations {
    @Override
    public double execute(double num1, double num2) throws ArithmeticException {
        return num1 - num2;
    }
}
