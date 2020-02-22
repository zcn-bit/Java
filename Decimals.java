import java.util.*;
public class Decimals {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a % b == 0) {
            System.out.println("" + a / b);
            //若为整数，则直接输出
} else {
int c = a;
ArrayList<Integer> xiaoshu = new ArrayList<Integer>(); //记录各位小数
HashMap<Integer, Integer> pos = new HashMap<Integer, Integer>(); //HashMap用于寻找重复位置
int looppos = -1;
c = c % b;
while (c != 0) {
if (pos.containsKey(c))
{
looppos = pos.get(c); //若重复，则寻找之前的位置并跳出循环
break;
}
else{
xiaoshu.add(c * 10 / b); //计算一位小数，并将其放入arraylist
pos.put(c, pos.size());//将小数对应位置进行记录
}
c = c * 10 % b;
}
if (looppos == (-1)) {
System.out.print(a / b);
System.out.print('.');
for (int i : xiaoshu) {
System.out.print(i);
}
} else {
System.out.print(a / b);
System.out.print('.');
for (int j = 0; j < looppos; j++) {
                    System.out.print(xiaoshu.get(j));
                }
                System.out.print('(');
                for (int k = looppos; k < xiaoshu.size(); k++) {
                    System.out.print(xiaoshu.get(k));
                }
                System.out.print(')');
            }
        }
    }
}
