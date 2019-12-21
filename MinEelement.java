import java.util.ArrayList;


public class MinEelement {


        public int minNumberInRotateArray(int [] array) {
            int index1 = 0;
            int index2 = array.length - 1;
            while (array[index1] >= array[index2] && index1 < index2) {
                int mid = ((index2 - index1) >> 1) + index1;
                if (array[index1] == array[index2] && array[index1] == array[mid])
                    return minnum(array, index1, index2);
                if (array[index1] <= array[mid])
                    index1 = mid + 1;
                else
                    index2 = mid;
            }
            return array[index1];
        }
        public int minnum(int []array, int start, int end) {
            int ret = array[start];
            for (int i = start + 1; i <= end; ++i) {
                if (array[i] < ret)
                    ret = array[i];
            }
            return ret;
        }


}
