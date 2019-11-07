public class FindKth {



        public int findKth(int[] a, int n, int K) {
            return quickSort(a,0,n-1,K);
        }


        private int quickSort(int[] arr, int low, int high,int K){
            int p = partion(arr,low,high);
            if(K == p-low+1){
                return arr[p];
            }else if(p-low+1 > K){
                //递归左边
                return quickSort(arr,low,p-1,K);
            }else{
                //递归右边
                return quickSort(arr,p+1,high,K-(p-low+1));
            }
        }



        private int partion(int[] arr, int low, int high){
            int tmp = arr[low];//第一个数作为基准值
            while(low < high){
                while(low < high && arr[high] <= tmp){
                    high--;
                }
                if(low == high){
                    break;
                }else{
                    arr[low] = arr[high];//挖坑
                }
                while(low < high && arr[low] >= tmp){
                    low++;
                }
                if(low == high){
                    break;
                }else{
                    arr[high] = arr[low];
                }
            }
            arr[low] = tmp;//填坑
            return low;//返回的是基准值所在下标
        }




    }







