public class IntegerPow {
    public double Power(double base, int exponent) {
        if (exponent<0){
            base = 1 / base;
            exponent = -exponent;
        }
        double ret = 1.0;
        for (int i=0; i<exponent; ++i)
            ret *= base;
        return ret;
    }
}
