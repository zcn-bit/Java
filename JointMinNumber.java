

    import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
    public class JointMinNumber {

        public String PrintMinNumber(int [] numbers) {
            if(numbers == null || numbers.length == 0) {
                return new String("");
            }

            ArrayList<Integer> list = new ArrayList<>();
            for(int n : numbers) {
                list.add(n);
            }

            Collections.sort(list, (i1, i2) -> ((i1 + "" + i2).compareTo((i2 + "" + i1))));

            String result = "";
            for(int i = 0; i < list.size(); i++) {
                result += list.get(i);
            }

            return result;
        }
    }

