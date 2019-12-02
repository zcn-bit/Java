import java.util.Scanner;

public class Key {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String string=in.nextLine();
        char[] c=string.toCharArray();
        for(int i=0;i<c.length;i++){//译码  -5
            if(c[i]>='A'){
         if((c[i])>'E'){

          c[i]=(char)(c[i]-5);

         }
         else{
             c[i]=(char)(c[i]+21);
         }
            }


        }

        System.out.println(c);
    }
}
