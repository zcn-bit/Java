
import java.util.*;
//思路就是存储每个方块出现的次数，最后求次数最小的方块，即为得分数。
public class Score {

    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int temp = sc.nextInt();
            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }else{
                map.put(temp, 1);
            }
        }
        //判断每个元素出现的次数，次数最小的就是得分
        int score = Integer.MAX_VALUE;
        if(map.size() == n){ //保证n列上只出现n个不同的方块
            for(Integer key : map.keySet()){
                score = Math.min(score, map.get(key));
            }
        }else{
            score = 0;
        }
        System.out.print(score);
    }
}