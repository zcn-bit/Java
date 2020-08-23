public class AbnormalJumpSairs {//变态跳台阶  2^n
    public int JumpFloorII(int target) {
        return target <= 0 ? 0 : 1 << (target - 1);//f(n)=2*f(n-1)
    }
}
