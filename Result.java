public class Result {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        }
        if (base - 0.0 == 0.00001 || base - 0.0 == -0.00001)  {
            if (exponent < 0) {
                throw new RuntimeException("除0异常");
            }else{
                return 0.0;
            }
        }
        return exponent > 0 ? getPower(base, exponent) : 1/getPower(base, -exponent);
    }

    public static double getPower(double base, int e) {
        if (e == 1) {
            return base;
        }
        double halfPower = getPower(base, e >> 1);
        return (e & 1) != 0 ? base * halfPower * halfPower : halfPower * halfPower;
    }
}
