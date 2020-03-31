import java.util.*;
import java.util.LinkedList;
import java.util.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SimpleMistakeRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String filename;
        String key;
        String path;
        while (scanner.hasNext()) {
            path = scanner.next();
            int id = path.lastIndexOf("\\");//从右往左看
            //需要判断存不存在  存在：有路径+文件名   不存在：只有文件名
            filename = id < 0 ? path : path.substring(id + 1);//  id之后

            int linenum = scanner.nextInt();
            key = filename + " " + linenum;//文件名+行号是map的key
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);//keding第一次出现
            }


//对记录进行排序
//按次数降序排列，次数相等按出现顺序排序
            List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());//讲所有的键值对映射放到list

            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){//利用colections给list按照一定规则排序
                @Override

                public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
                    return (arg1.getValue() - arg0.getValue()) == 0 ? (arg0.getValue() - arg1.getValue()) : (arg1.getValue() - arg0.getValue());
                }
            });

            //打印8个0数据
            int count = 1;
            for (Map.Entry<String, Integer> item : list) {
                if (count <= 8) {
                    String[] arr = item.getKey().split(" ");
                    String k = arr[0].length() > 16 ? arr[0].substring(arr[0].length() - 16) : arr[0];//[)  文件名
                    String n = arr[1];//行号
                    System.out.println(k + " " + n +" "+item.getValue());
                    count++;
                } else {
                    break;//终止循坏
                }
            }


        }
    }
}




