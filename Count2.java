
public class Count2 {
    public int countNumberOf2s(int n) {
        int high=0;
        int low=0;
        int count=0;
        int cur=0;
        int sum=0;
        int factor=1;//从个位开始向高位走
        while(n/factor!=0){ // =0是factor超过了N的位数
            cur=(n/factor)%10;
            high=n/(factor*10);
            low=n-(n/factor)*factor;
            if(cur<2){//只可能有一种情况
                count+=high*factor;

            }
            if(cur==2){
                count+=high*factor+1+low;

            }
            if(cur>2){
                count+=(high+1)*factor;

            }
            factor=factor*10;
            //sum=sum+count;
        }
        return count;



    }
    }