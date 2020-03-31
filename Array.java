import java.util.Collection;
import java.util.HashMap;
        import java.util.Map;
        import java.util.Set;

public class Array {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length/2;
        Map<Integer,Integer>   map=new HashMap<Integer, Integer>() ;
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> mapping: map.entrySet()){
            if(mapping.getValue()>len){
                return mapping.getKey();
            }
        }
        return  0;
    }
}
