package projects.CalculatorApp.interfaces;

@FunctionalInterface
public interface CalculatorOperations {
    double execute(double num1, double num2) throws ArithmeticException;
}
