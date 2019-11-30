public class Money {

    import java.util.*;

    public class Money {
        public int getValue(int[] gifts, int n) {
            // write code here

            int[] count=new int[n];
            for(int i=0;i<count.length;i++){
                count[i]=1;
            }
          for(int i=0;i<n-1;i++){
          for(int j=1;j<n;j++){
              if(gifts[i]==gifts[j]){
                      count[i]++;
                      if(count[i]>n/2){
                          return  gifts[i];
                      }
              }

          }
          }

          return  0;
        }

    }


}
