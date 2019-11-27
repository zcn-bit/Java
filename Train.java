import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Set;
public class Train {

    public static boolean isLegal(int[] in,int[] out,int n){
        int i=0;
        int j=0;
        Stack<Integer>  stack=new Stack<>();
        while (i<n){
            if(in[i]==out[j]){
                i++;
                j++;
            }
            else{
                if(stack.empty()){
                    stack.push(in[i]);
                    i++;
                }
                else {
                    int top=stack.peek();
                    if(top==out[j]){
                        j++;
                        stack.pop();

                    }
                    else{
                        if(i<n){
                            stack.push(in[i]);
                            i++;
                        }
                    }
                }
            }
        }

        while(!stack.empty()&&j<n){
            int top=stack.pop();
            if(top==out[j]){
                j++;
            }
            else {
                return false;
            }

        }

        return true;
    }


public static void swap(int[] arr,int i,int j){
    int tmp=arr[i];
    arr[i]=arr[j];
    arr[j]=tmp;
}


  public static  void  Permutation(int []arr,int start,int N, ArrayList<int[]> result){
      if(start==N){
          return;
      }
      if(start==N-1){
          int [] str=arr.clone();//数组拷贝
          result.add(str);
          return;
      }
      for(int i=start;i<N;i++){
          swap(arr,i,start);
          Permutation(arr,start+1,N,result);
          swap(arr,i,start);
      }
  }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {//有多组测试用例
            int N = in.nextInt();//[1,9]
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }

            ArrayList<int[]> result = new ArrayList<>();//很多组，
            int start = 0;
            Permutation(arr, start, N, result);
            Set<String> set = new TreeSet<String>();
            for (int[] out : result) {//遍历result
                if (isLegal(arr, out, N)) {
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < N - 1; i++) {
                        sb.append(out[i] + " ");


                    }

                    sb.append(out[N - 1]);
                    set.add(sb.toString());
                }

                for (String s : set) {//遍历 里是string的set
                    System.out.println(s);
                }
            }
        }



    }

}
