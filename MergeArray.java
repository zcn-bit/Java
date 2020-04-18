import java.util.Map;

public class MergeArray {
    public int[][] merge(int[][] intervals) {//二维数组
//[1,4][3,6]==[1,6]
        int len = intervals.length;
        if (len < 2) {
            return null;
        }
        int cnt=0;
        for (int i = 0; i < len - 1; i++) {//走到倒数第二个
            for (int j = i + 1; j < len; j++) {
                if (intervals[i][0] <= intervals[j][1] && intervals[i][1] >= intervals[j][0]) {
                    intervals[j][0] = Math.min(intervals[i][0], intervals[j][0]);
                    intervals[j][1] = Math.max(intervals[i][1], intervals[j][1]);
                    intervals[i] = null;
                    cnt++;//合并一次，总个数-1
                }
                break;
            }

        }
        int[][] res=new int[len-cnt][2];
        int index=0;
        for (int[] arr:intervals){//每一个元素又是一个一维数组
            if(arr!=null) {
                res[index] = arr;
                index++;
            }
        }
        return res;
    }
}

