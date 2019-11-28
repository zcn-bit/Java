public class SwapMoney {

    public static void main(String[] args) {
        int days=30;
        long richer=0;
        long pooler=1;
        long pool=1;

        for(int i=1;i<=days;i++){
            richer=richer+10;
        }
        for (int i=1;i<30;i++){
            pooler=pooler*2;//这里只计算了一项
            pool=pool+pooler;//要累加求和
        }

        System.out.println(richer);
        System.out.println(pool);

    }
}
