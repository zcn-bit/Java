public class GetNumberOfK {

        public int GetNumberOfK(int [] array , int k) {
            int len = array.length;
            int count = 0;
            if (len == 0) return count;
        /*
        for (int i = 0; i < len; i++) {
            if (array[i] == k) count++;
        }
        */
            // 题目中说了是有序数组

            int last = getLast(array, k, 0, len-1);
            if (last == -1) return 0;
            int first = getFirst(array, k, 0, len-1);
            return last - first + 1;
        }

        public int getFirst(int[] array, int k, int start, int end) {
            if (start > end) return -1;
            if (start == end) {
                if (array[end] == k)
                    return end;
                else
                    return -1;
            }
            int mid = (start + end) / 2;
            if (array[mid] >= k)
                return getFirst(array, k, start, mid);
            else
                return getFirst(array, k, mid+1, end);
        }

        public int getLast(int[] array, int k, int start, int end) {

            while (start < end) {
                int mid = (start + end) / 2 + 1;
                if (array[mid] > k)
                    end = mid - 1;
                else
                    start = mid;
            }
            return (array[start] == k) ? start : -1;
        }
    }



