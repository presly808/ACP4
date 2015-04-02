package math;

/**
 * Created by serhii on 28.03.15.
 */
public class IMathImpl implements IMath {
    @Override
    public double divide(double d1, double d2) {
        return d1 / d2;
    }

    @Override
    public int divide(int i1, int i2) {
        return i1 / i2;
    }

    @Override
    public int sum(int a1, int a2) {
        return a1 + a2;
    }
}
