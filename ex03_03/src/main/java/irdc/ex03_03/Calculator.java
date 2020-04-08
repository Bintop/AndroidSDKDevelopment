package irdc.ex03_03;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double divide(double divident, double dividor) {
        if (dividor == 0) {
            throw new IllegalArgumentException("Dividor cannot be 0");
        }

        return divident / dividor;
    }
}
