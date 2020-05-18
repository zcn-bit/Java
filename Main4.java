import java.util.*;
//员工的重要性
public class Main4 {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };
        public int getImportance(List<Employee> employees, int id) {
            if(employees == null || employees.size() == 0) {
                return 0;
            }
            int res = 0;
            Queue<Integer> q = new LinkedList<>();
            q. offer(id);
//把员工信息保存在map中，方便查询
            Map<Integer, Employee> m = new HashMap<>();
            for (Employee e : employees)
                m. put(e.id, e);//k v
//遍历队列
            while (!q. isEmpty()) {
                int t = q.peek();
                q.poll() ;
                res += m.get(t).importance;//
                for (int num : m.get(t).subordinates) //得到直系下属的id
                    q.offer(num) ;
            }
            return res;
        }

}
