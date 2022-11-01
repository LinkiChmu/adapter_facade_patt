package facade;

public class Main {

    public static void main(String[] args) {

        Operation bins = new BinOps();
        System.out.println(bins.sum("0010", "0001"));
        System.out.println(bins.mult("0010", "0010"));
        System.out.println("*******************************");
        Operation hexs = new HexOps();
        System.out.println(hexs.sum("A", "6"));
        System.out.println(hexs.mult("3", "5"));

    }
}
