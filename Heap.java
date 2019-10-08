import java.util.Arrays;
import java.util.Random;

public class Heap {
    public static void shiftDownSmall(int[] array, int index, int size) {
        int left = 2 * index + 1;
        while (left < size) {
            int right = left + 1;
            int min = left;
            if (right < size) {
                if (array[right] < array[left]) {
                    min = right;
                }
            }
            if (array[index] > array[min]) {
                swap(array, index, min);
                index = min;
                left = 2 * index + 1;
            } else {
                break;
            }
        }
    }

    public static void shiftDownBig(int[] a, int i, int s) {//向下调整成大堆
        while (2 * i + 1 < s) {//i是最后一个双亲结点
            int m = 2 * i + 1;//i的左孩子下标
            if (m + 1 < s && a[m + 1] > a[m]) {
                m++;
            }//m为大孩子的下标
            if (a[i] >= a[m]) {
                break;//满足大堆
            }

            swap(a, i, m);//不满足大堆，没有退出，交换双亲和大孩子
            i = m;//向下调整。大孩子又作为双亲
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void createHeapSmall(int[] a, int s) {
        for (int i = (s - 2) / 2; i >= 0; i--) {
            shiftDownSmall(a, i, s);
        }
    }

    public static void createHeapBig(int[] a, int s) {
        for (int i = (s - 2) / 2; i >= 0; i--) {//开始调整元素的下标（位置）
            shiftDownBig(a, i, s);
        }
    }

    /*
    public static void main(String[] args) {
        int[] small = { 39, 15, 3, 18, 40, 5, 6, 51, 52, 70 };
        shiftDownSmall(small, 0, small.length);
        System.out.println(Arrays.toString(small));

        int[] big = { 100, 50, 30, 25, 40, 80, 70, 10, 5, 20, 30, 60, 70, 60, 70, 5 };
        shiftDownBig(big, 2, big.length);
        System.out.println(Arrays.toString(big));

        int[] t = new int[10];
        Random random = new Random(20190922);
        for (int i = 0; i < 10; i++) {
            t[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(t));
        createHeapSmall(t, t.length);
        System.out.println(Arrays.toString(t));
    }
    */

    public static void shiftUpSmall(int[] array, int i) {
        // 直到 i == 0 之前，一直
        // 先找到 i 的双亲的下标
        // 比较 array[parent] 和 array[i]
        // 如果满足条件，调整结束
        // 否则，交换，然后 让 i = parent 继续
        while (i != 0) {
            int p = (i - 1) / 2;
            if (array[p] <= array[i]) {
                break;
            }
            swap(array, p, i);
            i = p;
        }
    }

    public static void heapSort(int[] array) {
        createHeapBig(array, array.length);
        for (int i = 0; i < array.length - 1; i++) {//排序，10个数循坏9次，控制循坏
            // 无序 [0, array.length - i)  减少
            // 有序 [array.length - i, array.length)  
            swap(array, 0, array.length - i - 1);//无序中的第一个和最后一个元素交换
            // 无序 [0, array.length - i - 1)
            // 长度 array.length - i - 1
            shiftDownBig(array, 0, array.length - i - 1);//0号下标向下调整
        }
    }

    public static void main(String[] args) {
        int[] a = { 9, 4, 1, 3, 7, 1, 2, 2, 9, 8 };
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
}
