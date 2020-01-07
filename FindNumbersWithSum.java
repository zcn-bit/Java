

    import java.util.ArrayList;
    public class FindNumbersWithSum {
        public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
            ArrayList<Integer> res = new ArrayList<>();
            int right = array.length - 1;
            int left = 0;
            while(right>left){
                if(array[right] + array[left] > sum)
                    right--;
                else if(array[right] + array[left] < sum)
                    left++;
                else{
                    res.add(array[left]);
                    res.add(array[right]);
                    return res;
                }
            }
            return res;
        }
    }

