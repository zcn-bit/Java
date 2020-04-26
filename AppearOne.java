import java.util.*;

public class AppearOne {
    private static void solution1(int[] arr){
       Map<Integer,Integer> mm=new HashMap<Integer,Integer>();
for(int i=0;i<arr.length;i++){
//偶数最终将不在map中
if(mm.containsKey(arr[i])){
mm.remove(arr[i]);//第二次遇见移除这个元素r
}else{
mm.put(arr[i],1);//第一次遇见放进去
}
}
Set<Map.Entry<Integer,Integer>> res=mm.entrySet();//得到map中所有的键值对元素
//set中的元素类型也是键值对结构
int [] str=new int[2];
for(Map.Entry<Integer,Integer> en : res){//遍历set
if(str[0]==0){//意思是数组中还未放元素，默认值0
str[0]=en.getKey();
}else{//第一个位置已经被放了
str[1]=en.getKey();//因为总两个数
}
}
if(str[0]>str[1]){
    str[0]=str[0]^str[1];
    str[1]=str[0]^str[1];
    str[0]=str[0]^str[1];
}
System.out.println(  str[0]+" "+str[1]);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        solution1(arr);
    }
}
