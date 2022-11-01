package facade;

public class HexOps implements Operation{
    protected final int RADIX = 16;

    @Override
    public String sum(String a, String b) {
        int sum = Integer.parseInt(a, RADIX) + Integer.parseInt(b, RADIX);
        return Integer.toHexString(sum);
    }

    @Override
    public String mult(String a, String b) {
        int mult = Integer.parseInt(a, RADIX) * Integer.parseInt(b, RADIX);
        return Integer.toHexString(mult);
    }
}
