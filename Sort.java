import java.util.Arrays;
import java.util.Random;

public class Sort {
    // 直接插入排序
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 有序   [0, i)
            // 无序   [i, array.length)
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {//cong qianmain youxu 段中找比key大的数，把key放到那个位置
                if (array[j] <= key) {
                    break;
                } else {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = key;//升序排列
        }
    }

    /**
     * 时间复杂度
     * 最好       平均          最坏
     * O(n)       O(n^2)        O(n^2
     * 数据有序                 数据逆序
     * 空间复杂度
     * O(1)
     * @param array
     */
    public static void insertSort0(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // 有序   [0, i)
            // 无序   [i, array.length)
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }

    public static void shellSort(int[] array) {
        int gap = array.length;
        while (true) {
            gap = (gap / 3) + 1;
            //gap = gap / 2;
            insertSortWithGap(array, gap);
            if (gap == 1) {
                break;
            }
        }
    }
    private static void insertSortWithGap(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - gap; j >= 0 && array[j] > key; j -= gap) {
                array[j + gap] = array[j];
            }
            array[j + gap] = key;
        }
    }

    public static void selectSort0(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 无序区间 [i, array.length)
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array, minIndex, i);
        }
    }

    public static void selectSort2(int[] array) {//一次找到最大最小数
        // 无序: [begin, end]
        int begin = 0;
        int end = array.length - 1;

        while (begin < end) {
            int minIndex = begin;
            int maxIndex = begin;
            for (int j = begin + 1; j <= end; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(array, minIndex, begin);//将最下的数放到begin   原来的begin暂存在最小数原来位置
            if (maxIndex == begin) {
                maxIndex = minIndex;
            }
            swap(array, maxIndex, end);//最大的数放到最后
            begin++; end--;
        }
    }

    public static void selectSort(int[] array) {
        // 每次选最大的放到无序区间的最后
        for (int i = 0; i < array.length - 1; i++) {
            // 无序 [0, array.length - i)
            // 有序 [array.length - i, array.length)
            int maxIndex = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[maxIndex]) {//找出无序段目前最大的数
                    maxIndex = j;
                }
            }

            swap(array, maxIndex, array.length - i - 1);//把最大的数放到后半段有序段的最前面
        }
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        testRight();
        testSpeed();
    }

    public static void heapSort(int[] array) {
        createHeapBig(array);
        for (int i = 0; i < array.length - 1; i++) {
            // 无序 [0, array.length - i)
            // 交换 array[0], array[length - i - 1]
            // 无序 [0, array.length - i - 1)
            // 无序长度 array.length - i - 1
            // 下标 0 进行向下调整
            swap(array, 0, array.length - i - 1);
            shiftDownBig(array, 0, array.length - i - 1);
        }//向下调整大堆，下标【0】是目前最大的数，交换到最后一个。  最后排好的是升序  
    }

    private static void createHeapBig(int[] array) {
        for (int i = (array.length - 2) / 2; i >= 0; i--) {
            shiftDownBig(array, i, array.length);
        }
    }//建堆从最后一个双亲结点开始，向下调整，结点往上走，到0下标

    private static void shiftDownBig(int[] array, int i, int size) {//向下调整需要数组长度，向下无界限
        while (2 * i + 1 < size) {
            int max = 2 * i + 1;
            if (max + 1 < size && array[max+1] > array[max]) {
                max = max + 1;//max ++
            }
            if (array[i] >= array[max]) {
                return;
            }
            swap(array, i, max);
            i = max;
        }
    }
//循环一次。i增加1 J-1   j 为两两比较，前面的那个数字
    public static void bubbleSort(int[] array) {//升序
        for (int i = 0; i < array.length - 1; i++) {//3个数比较2次
            boolean isSort = true;
            for (int j = 0; j < array.length - i - 1; j++) {//J 刚开始最多到倒数第二个数字
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    isSort = false;
                }
            }
            if (isSort) {
                return;
            }
        }
    }

    public static void testRight() {
        int[] a = { 2, 3, 7, 9, 4, 5, 6, 9, 1, 4, 7, 8 };

        int[] b = a.clone();
        bubbleSort(b);//冒泡排序
        System.out.println(Arrays.toString(b));//shu组转化为字符串

        int[] c = a.clone();
        Arrays.sort(c);//引用系统自动函数
        System.out.println(Arrays.toString(c));

        System.out.println(Arrays.equals(b, c));
    }

    public static void testSpeed() {
        Random random = new Random(20190924);
        int[] a = new int[10 * 10000];
        for (int i = 0; i < 10 * 10000; i++) {
            a[i] = random.nextInt(10 * 10000);
        }

        long begin = System.nanoTime();
        bubbleSort(a);
        long end = System.nanoTime();

        double ms = (end - begin) * 1.0 / 1000 / 1000;
        System.out.printf("一共耗时: %.5f 毫秒%n", ms);
    }
}
