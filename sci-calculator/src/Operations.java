public class Operations implements IOperations {

    @Override
    public int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Override
    public int subtract(int... numbers) {
        int sub = 0;
        for (int number : numbers) {
            sub -= number;
        }
        return sub;
    }

    @Override
    public int multiply(int... numbers) {
        int mul = 1;
        for (int number : numbers) {
            mul *= number;
        }
        return mul;
    }

    @Override
    public double divide(int... numbers) {
        double div = 1;
        for (int number : numbers) {
            if (number == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            } else {
                div /= number;
            }
        }
        return div;
    }

    @Override
    public int absoluteValue(int number) {

        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }

    @Override
    public int power(int number, int power) {
        int pow = 1;
        for (int i = 0; i < power; i++) {
            pow *= number;
        }
        return pow;
    }

    @Override
    public double squareRoot(int number) {
        double sqrt = number;
        int i = 0;
        while (sqrt != (number / sqrt)) {
            sqrt = (sqrt + (number / sqrt)) / 2;
            i++;
        }
        return sqrt;
    }

    @Override
    public int modulus(int divisor, int dividend) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return divisor % dividend;
        }

    }

}