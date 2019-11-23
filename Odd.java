import java.util.*;
public class Odd {
    public static void findOdd(int n){
List<Integer> ret=new ArrayList<>();//存放奇数
if(n<0){//N为个数，就不能为负数
    ret.add(0);
}
if(n==1){
    ret.add(1);
}
if(n>1) {//符合要求
    int tempSum = n * n;//n的平方
    int toAdd = tempSum;//在平方的基础上加减
    int toSub = tempSum;
    if (tempSum % 2 == 0) {//判断n平方的奇偶  偶
        toAdd = toAdd + 1;
        toSub = toSub - 1;


    } else {
        //平方为奇
        toAdd = toAdd + 2;
        toSub = toSub - 2;
        ret.add(tempSum);
    }
    for (int i = 0; i < n / 2; i++) {
        ret.add(toAdd);
        ret.add(toSub);
        toAdd = toAdd + 2;//更新 但不一定循坏用
        toSub = toSub - 2;
    }//奇数放完  但ret的数字无序
}
  Object[] tempRet=ret.toArray();//
    Arrays.sort(tempRet);//链表转为数组，利用数组排序的方法
      /*  for(int i=0;i<tempRet.length;i++){
            System.out.print(tempRet[i]+" ");//空格题目要去
        }//遍历这个有序的数组
        */
        for(int i=0;i<tempRet.length-1;i++){
            System.out.print(tempRet[i]+"+");
        }
        System.out.print(tempRet[tempRet.length-1]);
}




    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        findOdd(m);//寻找奇数之和
    }
}
//println  打印完换行回车