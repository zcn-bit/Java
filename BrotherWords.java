import java.util.*;

public class BrotherWords {
    private static int checkBrotherWord(String key,String word,char[] keyChar){
if(key.equals(word)||word.length()!=keyChar.length){
    return 0;
}
char[] wordChar=word.toCharArray();
Arrays.sort(wordChar);
if(Arrays.equals(keyChar,wordChar)){
    return 1;
}else {
    return 0;
}
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int num=scanner.nextInt();
        List<String> list=new ArrayList<>();
        String[] arr=new String[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.next();
        }
        String key=scanner.next();
        char[] keyChar=key.toCharArray();
       // Arrays.sort(keyChar);  //只有一个单词
        int k=scanner.nextInt();//输出第k个单词
        for (int i=0;i<arr.length;i++) {
           int c= checkBrotherWord(key,arr[i],keyChar);//要么1 要么0
           count=count+c;
           if(c==1){//是兄弟单词
               list.add(arr[i]);

           }
        }
        System.out.println(count);//兄弟单词的个数
        Collections.sort(list);
        if(count>k){
            System.out.println(list.get(k-1));
        }

    }
}
