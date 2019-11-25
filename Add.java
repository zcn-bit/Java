public class Add {

    public int addAB(int A, int B) {
        // write code here
        while (B!=0) {
            int xor = A ^ B;//求和  本位
            int and = (A & B)<<1;//
            A=xor;
            B=and;//进位为0，加法完毕
        }
        return A;
    }
}
