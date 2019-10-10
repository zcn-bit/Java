public class Course0717 {
	public static int find(int[][] a, int v) {
		for (int i = 0; i < a.length; i++) {
			int[] ia = a[i];//int[] b=a[i];////二维数组 数组名后直接加上length，所指的是有几行
//指定索引后加上length(如arr[0].length),指的是该行所拥有的元素，是列的数目
			for (int j = 0; j < ia.length; j++) {//上面一次，下面循坏3次 一行有几列
				if (ia[j] == v) {
					return i;
				}
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		int a = 1;
		System.out.printf("%d%n", a);
		boolean b = true || (a++) == 1;
		System.out.printf("%d%n", a);
		boolean c = true | (a++) == 1;//二进制按位或
		System.out.printf("%d%n", a);
		
		int[][] arr = {
			{ 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 }
		};
		System.out.println(find(arr, 5));
	}
	
	
	

	public String add(String a, String b) {
		return a + b;
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}