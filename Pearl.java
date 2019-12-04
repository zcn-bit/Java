import java.util.Scanner;

public class Pearl {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String  host=in.nextLine();
        String  visitor=in.nextLine();
        char[] c=visitor.toCharArray();
        int len=0;
        int length=0;

        if(host.length()<=0){
            System.out.println("NO"+ " "+visitor.length());


        }

        if(visitor.length()<=0) {
            System.out.println("YES"+" "+host.length());
        }
        if(visitor.length()>=host.length()){
            len=visitor.length();
            length=host.length();
        }else{
            len=host.length();
            length=visitor.length();
        }
        int sum=0;
      int[]  count=new int[len];
//      for(int i=0;i<count.length;i++){
//          count[]
//      }
        for(int i=0;i<length;i++){
            if((-1)!=host.indexOf(c[i])){
                count[i]=1;
                sum++;
            }else {

                count[i]=0;
            }


        }


        if(visitor.length()>sum){
            int l=visitor.length();
            System.out.println("NO"+" "+(l-sum));

        }
        if(visitor.length()==sum){
            int l=host.length();
            System.out.println("YES"+" "+(l-sum));
        }


    }
}
