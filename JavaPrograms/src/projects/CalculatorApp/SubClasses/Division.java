package projects.CalculatorApp.SubClasses;

import projects.CalculatorApp.interfaces.CalculatorOperations;

public class Division implements CalculatorOperations {
    @Override
    public double execute(double num1, double num2) throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("Divisible By Zero");
        }
        return num1 / num2;
    }
}
