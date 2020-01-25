
import java.util.ArrayDeque;
        import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.Queue;
        import java.util.concurrent.LinkedBlockingQueue;
public class Max {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        if (num.length<size||size==0){
            return list;
        }
        if (size==1){
            for (int i = 0; i < num.length; i++) {
                list.add(num[i]);
            }
            return list;
        }
        for (int i = 0; i < num.length; i++) {
            if (i<size-1){
                if (queue.isEmpty()){
                    queue.add(i);
                }else{
                    if (num[i]>num[queue.peek()]){
                        queue.clear();
                        queue.add(i);
                    }else{
                        queue.add(i);
                    }
                }
            }else {
                if (i-queue.peek()>=size){
                    queue.poll();
                }
                if (num[i]>num[queue.peek()]){
                    queue.clear();
                    queue.add(i);
                }else{
                    int size1 = queue.size();
                    for (int j = 0; j < size1; j++) {
                        Integer p = queue.poll();
                        if (num[p]>num[i]){
                            queue.add(p);
                        }
                    }
                    queue.add(i);
                }
                list.add(num[queue.peek()]);
            }
        }
        return list;
    }
}
