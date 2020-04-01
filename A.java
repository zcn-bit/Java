import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args){
        String str = "123";
        int m=6;
        List<String> result = new ArrayList<String>();
        getAllLists(result,str,"");
        for(String each : result){
           int num=Integer.valueOf(each);
           if(num%6==0){
               System.out.println(num);
           }
        }
    }
    /**   
     * @param base 以该字符串作为基础字符串，进行选择性组合。  
     * @param buff 所求字符串的临时结果  
     * @param result 存放所求结果  
     */
    public static void getAllLists(List<String> result, String base, String buff){
        if(base.length() <= 0){
            result.add(buff.toString());
        }
        for(int i = 0; i < base.length(); i++){
            getAllLists(result, new StringBuilder(base).deleteCharAt(i).toString(),
                    buff + base.charAt(i));
        }
    }


}
