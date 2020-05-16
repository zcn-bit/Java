


        import java.util.*;
        public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);//为了统一处理，
        sb.append("R");//在最右边加一个“R”
        sb.insert(0, "L");//在最左边加一个“L”
        List<Integer> v = new ArrayList<>();//记录含有L或R的下标位置
        for(int i = 0; i < sb.length(); ++i){
            if(sb.charAt(i) == 'L' || sb.charAt(i) == 'R')
                v.add(i);;
        }
        for(int p = 0; p < v.size() - 1; ++p){//按RL区间端点分类，共有4类
            int i = v.get(p), j = v.get(p + 1);//一个区间一个区间处理
            char c1 = sb.charAt(i), c2 = sb.charAt(j);
            if(c1 == 'L' && c2 == 'L'){
                for(int k = i + 1; k < j; ++k)
                    sb.setCharAt(k, 'L');
            }
            if(c1 == 'L' && c2 == 'R'){}//这种什么也不用做
            if(c1 == 'R' && c2 == 'L'){
                for(int k = i + 1; k < (double)(j + i)/2; ++k)
                    sb.setCharAt(k, 'R');
                for(int k = j - 1; k > (double)(j + i)/2; --k)
                    sb.setCharAt(k, 'L');
            }
            if(c1 == 'R' && c2 == 'R'){
                for(int k = i + 1; k < j; ++k)
                    sb.setCharAt(k, 'R');
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(0);//把开始加的那两张去掉
        System.out.println(sb);
    }
}