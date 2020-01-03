public class MaxAdd {


        public int FindGreatestSumOfSubArray(int[] array) {
            if (array.length==0 || array==null) {
                return 0;
            }
            int curSum=0;
            int greatestSum=0x80000000;
            for (int i = 0; i < array.length; i++) {
                if (curSum<=0) {
                    curSum=array[i]; //记录当前最大值
                }else {
                    curSum+=array[i]; //当array[i]为正数时，加上之前的最大值并更新最大值。
                }
                if (curSum>greatestSum) {
                    greatestSum=curSum;
                }
            }
            return greatestSum;
        }
    
}
