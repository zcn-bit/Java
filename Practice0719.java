import java.util.Arrays;

public class Practice0719 {
	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}//
	
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean sorted = true;
			// 无序 [0, a.length - i)
			// 有序 [a.length - i, a.length)
			// 冒泡过程
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					sorted = false;
				}
			}
			
			if (sorted == true) {
				return;
			}
		}
	}
	
	public static void bubbleSort1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// 无序	[i, a.length)
			// 有序 [0, i)
			
			for (int j = a.length - 1; j > i; j--) {
				if (a[j] < a[j - 1]) {
					swap(a, j, j - 1);
				}
			}
		}
	}
	
	// 去掉一个最大值和最小值的平均值
	public static double average(int[] a) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int v : a) {
			sum += v;
			
			if (v > max) {
				max = v;
			}
			
			if (v < min) {
				min = v;
			}
		}
		
		return (double)(sum - max - min) / (a.length - 2);
	}
	
	public static void testBubbleSort(int[] a) {
		System.out.println("排序前:");
		System.out.println(Arrays.toString(a));
		bubbleSort1(a);
		System.out.println("排序后:");
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] rotate(int[] nums, int k) {
		k = k % nums.length;
		int[] rightPart = Arrays.copyOfRange(nums, nums.length - k, nums.length);
		//System.out.println(Arrays.toString(rightPart));
		System.arraycopy(nums, 0, nums, k, nums.length - k);
		//System.out.println(Arrays.toString(nums));
		System.arraycopy(rightPart, 0, nums, 0, k);
	
		return nums;
	}
	
	public static int[] partition1(int[] nums) {
		int begin = 0;
		int end = nums.length - 1;
		// [begin, end] 区间内的数是未判断的数
		// [0, begin)	偶数
		// [end, nums.length) 奇数
		
		while (begin < end) {
			while (begin < end && nums[begin] % 2 == 0) {
				begin++;
			}
			
			while (begin < end && nums[end] % 2 != 0) {
				end--;
			}
			
			swap(nums, begin, end);
		}
		
		return nums;
	}
	
	public static int[] partition2(int[] nums) {
		int d = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				swap(nums, i, d);
				d++;
			}
		}
		
		return nums;
	}
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 7, 6, 5, 4, 3, 2, 1 };
		int[] c = { 3, 5, 2, 4, 1, 7, 6 };
		int[] d = { 3, 3, 3, 3, 3, 3, 3 };
		
		testBubbleSort(a);
		testBubbleSort(b);
		testBubbleSort(c);
		testBubbleSort(d);
		
		System.out.println(average(
			new int[] { 1, 2, 3, 4, 5, 6, 7 }
		));
		
		System.out.println(Arrays.toString(rotate(
			new int[] { 1, 2, 3, 4, 5 },
			3
		)));
		
		System.out.println(Arrays.toString(rotate(
			new int[] { 1, 2, 3, 4, 5 },
			8
		)));
		
		System.out.println(Arrays.toString(rotate(
			new int[] { 1, 2, 3, 4, 5, 6, 7 },
			8
		)));
		
		System.out.println(Arrays.toString(partition2(
			new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9}
		)));
	}
}