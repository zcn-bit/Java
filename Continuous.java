

import java.util.*;

public class Continuous {
        public  boolean isContinuous(int[] numbers)
        {
            int zero = 0;
            Arrays.sort(numbers);
            int length = numbers.length;
            if(length == 0)return false;
            //统计0的数量
            for (int i = 0; i < length; i++)
            {
                if (numbers[i] == 0)
                {
                    zero++;
                }
            }

            //有一样的数字就取消
            ArrayList<Integer> help = help(numbers);
            for (int i = 0; i < help.size() - 1; i++)
            {
                if (help.get(i) == help.get(i + 1))
                {
                    return false;
                }
            }

            if (zero == 0)
            {
                for (int i = 0; i < length - 1; i++)
                {
                    if (Math.abs(numbers[i] - numbers[i + 1]) != 1)
                    {
                        return false;
                    }
                }
            }
            else if (zero == 1)
            {

                ArrayList<Integer> list = help(numbers);
                for (int i = 0; i < list.size() - 1; i++)
                {
                    if (Math.abs(list.get(i) - list.get(i + 1)) > 2 || (list.get(list.size() - 1) - list.get(0)) > 4)
                    {
                        return false;
                    }
                }
            }
            else if (zero == 2)
            {
                System.out.println("test");
                ArrayList<Integer> list = help(numbers);
                for (int i = 0; i < list.size() - 1; i++)
                {
                    if (Math.abs(list.get(i) - list.get(i + 1)) > 3 || (list.get(list.size() - 1) - list.get(0)) > 4)
                    {
                        return false;
                    }
                }
            }
            else if (zero == 3)
            {
                ArrayList<Integer> list = help(numbers);
                for (int i = 0; i < list.size() - 1; i++)
                {
                    if (Math.abs(list.get(i) - list.get(i + 1)) > 4 || (list.get(list.size() - 1) - list.get(0)) > 4)
                    {
                        return false;
                    }
                }
            }
            else
            {
                return true;
            }
            return true;
        }

        public  ArrayList<Integer> help(int[] numbers)
        {
            int length = numbers.length;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < length; i++)
            {
                list.add(numbers[i]);
            }
            Iterator it = list.iterator();
            while (it.hasNext())
            {
                if (it.next() == (Integer) 0)
                {
                    it.remove();
                }
            }
            return list;
        }


}
