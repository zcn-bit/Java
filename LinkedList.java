


    import java.util.*;

     class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public class LinkedList {

        public ListNode plusAB(ListNode a, ListNode b) {
            // write code here


          ListNode  result=null;
            if(a==null){
                return null;

            }
            if (b==null){
                return  a;
            }
          int sum=0;
          sum=a.val+b.val;
          ListNode node=new ListNode(sum);
          if(result==null){
              result=node;
          }else{

              node.next=result;
              result=node;
          }



           return  plusAB(a.next,  b.next);
        }
    }

