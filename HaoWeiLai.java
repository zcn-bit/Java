import java.util.*;
public class HaoWeiLai {




        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param nums int整型一维数组
         * @return int整型
         */
        public int thirdMax (int[] nums) {
            // write code here
            int len=nums.length;
            int max=nums[0];
            int min=nums[0];
            for(int i=0;i<len;i++){
                if(max<nums[i]){
                    int tmp=nums[i];
                    nums[i]=max;
                    max=tmp;
                }
                if(min>nums[i]){
                    int tmp=nums[i];
                    nums[i]=min;
                    min=tmp;
                }
            }
            int mid=min;
            for(int i=0;i<len;i++){
                if(nums[i]<max&&mid<nums[i]){
                    int tmp=nums[i];
                    nums[i]=mid;
                    mid=tmp;

                }
                if(nums[i]<mid&&min<nums[i]){
                    int tmp=nums[i];
                    nums[i]=min;
                    min=tmp;
                }
            }
            if(mid==min){
                return max;
            }
            return min;
        }


}
