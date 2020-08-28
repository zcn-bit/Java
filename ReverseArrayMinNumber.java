
public class ReverseArrayMinNumber {

    public int minNumberInRotateArray(int[] array) {
        int i = 0, j = array.length - 1;
        if (array[i] < array[j]) { // 2
            return array[i];
        }
        if (array[i] == array[j] && array[i] == array[(i + j) >> 1]) { // 3
            int min = array[i];
            for (; i <= j; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
        while (i + 1 < j) { // 1
            int mid = (i + j) >> 1;
            if (array[mid] >= array[i]) {
                i = mid;
            } else if (array[mid] <= array[j]) {
                j = mid;
            }
        }
        return array[j];
    }
}