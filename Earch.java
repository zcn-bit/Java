import java.util.Scanner;

public class Earch {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int L=in.nextInt();
        int Z=in.nextInt();
        for(int xa=0;xa<=L;xa++){

            for(int xb=0;xb<=3*Z;xb++){


                if((xa+3*xb==10) && (6*xa+4*xb==32)){

                    System.out.println(xa+" "+xb);
                    return;

                }
            }
        }

    }

}


