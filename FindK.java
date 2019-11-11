
public class FindK {
    public  static int findKth( int[]A,int n,int K) {
   return quickSort( A,0,n-1, K);

    }
    public static int quickSort(int[] A,int left,int right,int K){
int n=0;
        //int mid=(left+right)>>2;
        int p=partation(A,0,n-1);//返回基准值下biao

        if(K==p-left+1){
            return A[p];
        }
        else if(K<p-left+1){
          return   quickSort(A,left,p-1,K);

        }
        else return   quickSort(A,p+1,right,K-(p-left+1));
        }
    public static int partation(int[] A,int left,int right){
        int key=A[left];//基准值保存起来
        while(left<right){ //  >=    <
            while(left<right&&A[right]<=key){
                right--;
            }
           A[left]= A[right];//比大的应该放前面
            while (left<right&&A[left]>=key) {
                left--;
            }
            A[right]=A[left];

            }

    A[left]=key;//left==right
        return  left;
        }


        public static void main(String[] args) {
            int[] A = {1, 8, 9, 3, 2};
            int n = A.length;
int result=findKth(A,5,3);
          //  System.out.println(findKth(A, 5, 3));
            System.out.println(result);
        }

    }
