package test;

import domain.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiplyInt(2,10);
        calculator.multiplyFloat(2,10.5F);
    }
}
