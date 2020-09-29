import com.sun.org.apache.xml.internal.utils.StringComparable;

        import java.util.*;

public class DaoTong {
    private static void sort1(String[] array){
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    private static void sort2(String[] array){
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
//            if(map.get(array[i])!=null){
//                map.put(array[i],map.get(array[i])+1);
//            }else{
//                map.put(array[i],1);
//            }
            map.put(array[i],array[i].length());
        }
        // Collections.sort(map.values());
        Integer[] arr=new Integer[array.length];
        int i=0;
        for(Integer e:map.values()){
            arr[i++]=e;
        }
        Arrays.sort(arr);
        //  int k=0;
        for(int k=0;k<arr.length;k++){
            for(Map.Entry e:map.entrySet()){
                //e.getKey(arr[k++]);
                if(arr[k].equals(e.getValue())){
                    System.out.print(e.getKey()+" ");
                    break;
                }
            }
        }
    }
    /*
        private static void sort2(String[] array){

           // int[] len=new int[array.length];
           // TreeSet ts=new TreeSet(new StringComparator());
            List<String> list=new ArrayList<>();
            for(int i=0;i<array.length;i++){
               // len[i]=array[i].length();
                list.add(array[i]);
            }
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            Object[] ob=list.toArray();
            for(int i=0;i<ob.length;i++){
                // len[i]=array[i].length();
                System.out.print(ob[i]+" ");
            }
            System.out.println();

        }
        */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.next();
        }
        sort1(arr);
        sort2(arr);
    }

}
