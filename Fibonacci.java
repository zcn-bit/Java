public class Fibonacci {
    //输入整数N，输出斐波那契数列的第N项


        public int Fibonacci(int n) {
            if (n <= 1)
                return n;
            int pre2 = 0, pre1 = 1;
            int fib = 0;
            for (int i = 2; i <= n; i++) {
                fib = pre2 + pre1;
                pre2 = pre1;
                pre1 = fib;
            }
            return fib;
        }



}
