import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Global {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            String string=scanner.nextLine();
            String[] strings=string.split(" ");
            String A = strings[0];
            String B = strings[1];
            boolean flag=true;
            List<Character> list=new ArrayList<Character>();
            for(int i=0;i<A.length();i++){
                list.add(A.charAt(i));
            }
            char[] bb=B.toCharArray();
            for(int i=0;i<bb.length;i++){
                if(list.contains(bb[i])){
                   int index=list.indexOf(bb[i]);
                   if(index!=-1){
                       list.remove(index);
                   }

                }else {
                    flag=false;
                    System.out.println("no");
                    break;

                }

        }
        if(flag){
            System.out.println("yes");
            }
        }
    }
}
