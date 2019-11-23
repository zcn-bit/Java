import java.util.Scanner;

public class Add {
public static String AddLongInteger(String addend,String augend){
    char [] a1=addend.toCharArray();//字符串放入字符数组,因为要逐位相加
    char [] a2=augend.toCharArray();
    int result=a1.length>a2.length?a1.length+1:a2.length+1;//最长的+1=新的长度
    char [] c1=new char[result];//创建放结果的数组

    //将原来两个数组反转形成新的两个数组
    char [] b1=new char[a1.length];
    char [] b2=new char[a2.length];
    //操作
    for(int i=0;i<a1.length;i++){
        b1[i]=a1[a1.length-1-i];
    }//a1逆序放入b1

    for(int i=0;i<a2.length;i++){
        b2[i]=a2[a2.length-1-i];
    }//a2逆序放入b2

    for(int i=0;i<c1.length;i++){//初始化结果数组  0填充
        c1[i]='0';
    }

    for(int i=0;i<result-1;i++){
        //相加存储
        int count=0;
        if(b1.length-1-i>=0&&b2.length-1-i>=0){//数组元素下标
            count=b1[i]-'0'+b2[i]-'0';//char-0变为整数int

        }
        else if(b1.length-1-i>=0&&b2.length-1-i<0){//b2 没了，
            count=b1[i]-'0';//只操作b1
        }
        else if(b1.length-1-i<0&&b2.length-1-i>=0){//b1 没了，
            count=b2[i]-'0';//只操作b2
        }
        int value=c1[i]-'0'+count;//c1的char变为int
        c1[i]=(char)(value%10+'0');//13 的话  这位放3
        //c1[i+1]=char(c1[i+1])+(char)(value/10);//这放1（相当于10）+该位原来数
        c1[i+1]+=value/10+'0';
    }

    //判断C1的最后一位（c2的第一位  要输出）是否为0
    while(c1[result-1]=='0'){
        result--;//结果数组的长度

    }
    char [] c2=new char[result];//创建要输出的新数组 这时的result是有效长度。C2不可能开头为0
  for(int i=0;i<result;i++){
      c2[result-1-i]=c1[i];
  }
  String str=new String(c2);//传入字符数组的数组名（首元素地址）
  return str;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String addend = in.nextLine();
            String augend = in.nextLine();
            //AddLongInteger(arr1,arr2);
            System.out.println(AddLongInteger(addend,augend));
        }
    }
}
