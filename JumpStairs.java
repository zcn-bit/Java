public class JumpStairs {//跳台阶
    public int JumpFloor(int target) {

        if (target==1 || target==0){
            return 1;
        }
        else{
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
    }
}
