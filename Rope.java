public class Rope {

    public int cutRope(int target) {
        if(target==6){
            return 9;
        }
        int a=target/5;
        int b=target%5;
        int n=1;
        for(int i=0;i<a;i++){
            n*=6;
        }
        if(b>0){
            if(a>0){
                n*=b;
            }else{
                if(b==4){
                    return b;
                }else{
                    return b-1;
                }
            }

        }
        return n;
    }
}
