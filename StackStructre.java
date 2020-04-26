import javafx.scene.transform.Scale;

import java.util.Scanner;

public class StackStructre {//要求返回的是位置信息即下标，做错是因为返回了元素的值
   private static void solution(int[] arr){
       //[0]
//       for(int i=1;i<arr.length;i++){
//           if(arr[i]<arr[0]){
//               return "-1+" "+arr[i]";
//           }
//       }
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            int k=i+1;
            boolean flagj=false;//作为标志位
            boolean flagk=false;
            while (j>=0){
                if(arr[j]<arr[i]){
                    flagj=true;
                   break;
                }
                j--;
            }
            while (k<arr.length){
                if(arr[k]<arr[i]){
                    flagk=true;
                    break;
                }
                k++;
            }
            if(!flagj){//没有if
               j= -1;
            }
            if(!flagk){
                k= -1;
            }
            System.out.println(j+" "+k);
        }

  }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        solution(arr);
    }
}
