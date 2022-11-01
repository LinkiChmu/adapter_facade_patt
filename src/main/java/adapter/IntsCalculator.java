package adapter;

public class IntsCalculator implements Ints {
    protected final Calculator calculator;


    public IntsCalculator() {
        calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = calculator.newFormula();
        return (int) formula
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = calculator.newFormula();
        return (int) formula
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = calculator.newFormula();
        return (int) formula
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
