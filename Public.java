public class Public {
    public int getLCA(int a, int b) {
        // write code here
        if(a==b){
            return a;
        }
        if(a>b){
            return getLCA(a/2,b);
        }else{
            return getLCA(a,b/2);
        }

    }
}
