import java.util.Scanner;

public class Main10 {//最少换掉瓷砖的数量

public static int Solution(String s){
    int cnt=0;
char[] arr=s.toCharArray();
    for(int i = 1; i < arr.length; i++) {
        if(arr[i - 1] == arr[i]) {
            cnt++;
            i++;
        }
    }

    return cnt;
}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String string=scanner.nextLine();
            System.out.println(Solution(string));
        }
    }

}