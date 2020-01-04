
    import java.util.ArrayList;
    public class NthUglyNumber {
        public int GetUglyNumber_Solution(int index) {
            if( index <7 )
                return index;

            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            int i2 = 0;
            int i3 = 0;
            int i5 = 0;
            while(list.size() < index){
                int m2 = list.get(i2) * 2;
                int m3 = list.get(i3) * 3;
                int m5 = list.get(i5) * 5;
                int min = Math.min(m2,Math.min(m3, m5));
                list.add(min);
                if(m2 == min)
                    i2++;
                if(m3 == min)
                    i3++;
                if(m5 == min)
                    i5++;
            }
            return list.get(list.size()-1);
        }
    }

