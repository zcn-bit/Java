public class ThirdBig {
    int thirdMax(int[]nums, int numsSize)
    {   int max = nums[0];
        int min = nums[0];
        for (int i=0; i<numsSize; i++)
        {
            if (max<nums[i])
            {
                int tmp = nums[i];
                nums[i] = max;
                max = tmp;
            }
            if (min>nums[i])
            {
                int tmp = nums[i];
                nums[i] = min;
                min = tmp;
            }
        }
        int mid = min;
        for (int i=0; i<numsSize; i++)
        {
            if ( nums[i]<max && mid<nums[i])
            {
                int tmp = nums[i];
                nums[i] = mid;
                mid = tmp;
            }
            if (nums[i]<mid && min<nums[i] )
            {
                int tmp = nums[i];
                nums[i] = min;
                min = tmp;
            }
        }
        if (mid == min)
        {
            return max;
        }
        return min;
    }

  
}
