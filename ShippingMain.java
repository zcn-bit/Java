
import java.util.*;
public class ShippingMain {

    public static void main(String[] args){
        List<Integer>people=new ArrayList<Integer>();
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            people.add(scanner.nextInt());
        }
        int n=people.size();
        Integer limit=people.get(n-1);
        people.remove(n-1);
        Collections.sort(people);
        int count=0;
        while(people.size()!=0){
            Integer dif=limit-people.get(0);
            people.remove(0);
            for(int i=people.size()-1;i>=0;i--){
                if(dif>=people.get(i)){
                    people.remove(i);
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}