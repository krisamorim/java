package test;

import domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiplyFloat(2,10.5F);

        System.out.println(calculator.divideTwoNumber(200,20));
    }
}
