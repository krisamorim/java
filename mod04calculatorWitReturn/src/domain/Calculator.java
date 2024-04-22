package domain;

public class Calculator {
    public void sumNumber() {
        System.out.println(10 + 10);
    }

    public void multiplyInt(int num1, int num2){
        System.out.println(num1*num2);
    }

    public void multiplyFloat(float num1, float num2){
        System.out.println(num1*num2);
    }

    public double divideTwoNumber(double n1, double n2) {
        if (n1==0 || n2==0){
            return 0;
        }else {
            return n1/n2;
        }
    }

    public void alterarValor(int n1, int n2) {
        n1 =10;
        n2=20;
        System.out.println("1st number now is "+n1+"\n2nd numbar now is "+n2);
    }
}