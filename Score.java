import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){


            int n=scanner.nextInt();
            int []score=new int[n];//定义数组预先得到大小   new开辟数组空间
            int[] grade=new int[n];
            double []coursePoint=new double[n];
            for(int i=0;i<n;i++){//相应学分
                score[i]=scanner.nextInt();
            }
            for(int i=0;i<n;i++){//实际得分
                grade[i]=scanner.nextInt();
            }
             for(int i=0;i<n;i++){   //遍历实际得分
                if(grade[i]>=90&&grade[i]<=100){
                    coursePoint[i]=4.0;//相应绩点
                }
                 if(grade[i]>=85&&grade[i]<=89){
                     coursePoint[i]=3.7;
                 }
                 if(grade[i]>=82&&grade[i]<=84){
                     coursePoint[i]=3.3;
                 }
                 if(grade[i]>=78&&grade[i]<=81){
                      coursePoint[i]=3.0;
                 }

                 if(grade[i]>=75&&grade[i]<=77){
                     coursePoint[i]=2.7;
                 }
                 if(grade[i]>=72&&grade[i]<=74){
                     coursePoint[i]=2.3;
                 }
                 if(grade[i]>=68&&grade[i]<=71){
                     coursePoint[i]=2.0;
                 }
                 if(grade[i]>=64&&grade[i]<=67){
                     coursePoint[i]=1.5;
                 }
                 if(grade[i]>=60&&grade[i]<=63){
                     coursePoint[i]=1.0;
                 }
                 if(grade[i]<60){
                     coursePoint[i]=0;
                 }
             }
             double[] coursePoints=new double[n];
             for(int i=0;i<n;i++){
              coursePoints[i]=coursePoint[i]*score[i];
             }//每门学科的  学分绩点    不要忽略每一个要求
            double courseSum=0;
            for(int i=0;i<n;i++){
                courseSum=courseSum+coursePoints[i];
            }
            int scores=0;
            for(int i=0;i<n;i++) {
                scores=scores+score[i] ;
            }//所有学分之和


            double GPA=courseSum/scores;
            System.out.printf("%.2f",GPA);
        }
    }
}
