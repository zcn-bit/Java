import javafx.beans.InvalidationListener;
import javafx.beans.binding.MapExpression;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ApperentCount {
public static  int  maxscore(String str){
    String [] array=str.split(" ");//用空格分隔字符串中每个。放在数组中
    int sum=0;
    int[] arr=new int[array.length];
    for(int i=0;i<array.length;i++){
        arr[i]=Integer.valueOf(array[i]);//string转为int类型
    }

    int len=arr.length/2;//常量作为比较
    for(int i=0;i<arr.length;i++){//遍历整型的arr数组
        int count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }//
        //拿一个数和每一个数比较，符合时输出终止循坏，否则清零下一个。
        //如果是记录每一个数出现次数，可以将得到的数字存放到数组中
        if(count>=len){//得到的count与len比较，不符合时清0，接着下一个
            sum=arr[i];
            break;//找到不必再循坏。题目说明有一个数符合
        }
    }
    return sum;//就是那个数
}


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str=in.nextLine();//接受一行，当做字符串
            System.out.println(maxscore(str));

        }
    }

}
