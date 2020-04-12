

import java.util.*;

public class StringVanish {
   private   static void solution(String string){
       // StringBuilder sb=new StringBuilder(string);
        char[] arr=string.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }

        }
      //  StringBuilder sb=new StringBuilder();
        List<Character> list=new ArrayList<>();
        for (Map.Entry mapping: map.entrySet()){
            if((int)mapping.getValue()>2){
         list.add((Character) mapping.getKey());

            }
        }
        for (int i=0;i<arr.length;i++ ){
            if(!list.contains(arr[i])){
                System.out.print(arr[i]);

            }
        }
       System.out.println();
        //System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        solution(string);
    }
}
