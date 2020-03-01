
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
public class MeetMax {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        String[] str2 = bf.readLine().split(" ");
        int i=0,j=0;
        int count=0;
        while (i<str.length&&j<str2.length){
            /*System.out.println(str[i]+" "+str2[j]);
            System.out.println(str[i].compareTo(str2[j]));
            str[i].compareTo(str2[j])<=0*/
            if (Integer.valueOf(str[i])<=Integer.valueOf(str2[j])){
//                System.out.println(str[i]+" "+str2[j]);
                count++;
                i++;
                j++;
            }else {
                j++;
            }
//            System.out.println("count:"+count);
        }
        System.out.println(count);
    }

}