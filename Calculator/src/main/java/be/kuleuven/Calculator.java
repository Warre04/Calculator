package be.kuleuven;

public class Calculator {
    private int a;
    private int b;

    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 3);
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        return a / b;
    }



}
