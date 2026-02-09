/**
 * A small, correct class meant to be used by tests.
 */
public class SafeCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b must not be 0");
        }
        return a / b;
    }
}
