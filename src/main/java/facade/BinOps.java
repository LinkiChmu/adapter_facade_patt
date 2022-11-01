package facade;

public class BinOps implements Operation {
    protected final int RADIX = 2;

    @Override
    public String sum(String a, String b) {
        int sum = Integer.parseInt(a, RADIX) + Integer.parseInt(b, RADIX);
        return Integer.toBinaryString(sum);
    }

    @Override
    public String mult(String a, String b) {
        int mult = Integer.parseInt(a, RADIX) * Integer.parseInt(b, RADIX);
        return Integer.toBinaryString(mult);
    }
}
