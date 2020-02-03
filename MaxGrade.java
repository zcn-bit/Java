
import java.util.Scanner;
public class MaxGrade {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] val = new int[n];
        int[] state = new int[n];
        //保存瞌睡时的累计评分
        int sleep = 0;
        int[] sleepval = new int[n];
        for(int i=0;i<n;i++){
            val[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
            state[i] = scan.nextInt();
            if(state[i]==0){
                sleep += val[i];
            }
            sleepval[i] = sleep;
        }
        MaxGrade ma = new MaxGrade();
        int res = ma.getMaxVal(val,state,n,k,sleepval);
        System.out.println(res);
    }

    private static void axVal(int[] val, int[] state, int n, int k, int[] sleepval) {
    }

    public int getMaxVal(int[] val,int[] state,int n,int k,int[] sleepval){
        int res = 0;
        int addval = 0;
        for(int i=0;i<n;i++){
            if(state[i]==1) res += val[i];
            else{
                int wakeval = 0;
                if(i+k-1>=n){
                    wakeval =(i>0)?(sleepval[n-1]-sleepval[i-1]):sleepval[n-1];
                }else{
                    wakeval = (i>0)?(sleepval[i+k-1]-sleepval[i-1]):sleepval[i+k-1];
                }
                addval = addval>=wakeval?addval:wakeval;
            }
        }
        return res+addval;
    }
}