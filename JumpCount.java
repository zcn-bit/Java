public class JumpCount {
    //一只青蛙一次可以跳一阶或者两阶台阶，上一个N级台阶有多少种跳法


        public int JumpFloor(int target) {
            if(target == 1||target == 0){
                return 1;
            }else{
                return (JumpFloor(target - 1) + JumpFloor(target - 2));
            }
        }


}
