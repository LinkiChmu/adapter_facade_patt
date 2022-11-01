package adapter;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Computes Calculator");
        System.out.println(calc.newFormula()
                .addOperand(2.3)
                .addOperand(2.0)
                .calculate(Calculator.Operation.DIV)
                .result()
        );

        System.out.println("Computes IntsCalculator");
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));

    }
}
