import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StatisticalResult {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int candidateNum=scanner.nextInt();//4  候选人
            scanner.nextLine();//作用？？
        String candidates=scanner.nextLine();//A B C D
            String[] str1= str1=candidates.split(" ");
            for(String str11:str1){//遍历ABCD数组
                map.put(str11,0);
            }
            map.put("Invalid",0);//无效数

            int voterNum=scanner.nextInt();//8
            scanner.nextLine();
            String str2=scanner.nextLine();//投票结果
            String [] result=str2.split(" ");// a b c d e f g h
            for(String res:result){
                if (map.containsKey(res)){//结果是否合法
                    map.put(res,map.get(res)+1);

                }else {//不合法
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }

            //打印  遍历Map中的Key,

            for(Map.Entry<String,Integer> map1:map.entrySet()){//所有的键值映射射对
                System.out.println(map1.getKey()+" : "+map1.getValue());

            }//最后一行

        }
    }
}
