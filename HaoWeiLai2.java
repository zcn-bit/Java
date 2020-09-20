public class HaoWeiLai2 {
    public int maxSubArray (int[] nums) {
        // write code here
        int sum=0;
        for(int i=0;i<nums.length;i++){
int tempSum=0;
for(int j=0;j<nums.length;j++){
    tempSum=tempSum+nums[i];
    if(tempSum>sum){
        sum=tempSum;
    }
}
        }
        if(sum==0){
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++) {
                    if(nums[i]>nums[j]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
                }
                int len=nums.length;
            sum=nums[len-1];
            return sum;
            }else {
            return sum;
        }

    }
}
