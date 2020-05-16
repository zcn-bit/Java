

        import java.util.*;
public class Main2{

    public static void main(String[] args){
        //输入
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num==0||num==1) {
            System.out.println(num);
            return;
        }
        scanner.nextLine();
        String[] str = new String[num];
        for(int i=0;i<num;i++) {
            if(scanner.hasNext()) {
                String s = scanner.nextLine();
                str[i] = s;
            }
        }
        scanner.close();
        if(str==null){
            System.out.println(0);
            return;
        }
        ArrayList<Node> arr = new ArrayList<Node>();
        for(String s:str) {
            String[] s1 = s.split(" ");
            int leftval = Integer.valueOf(s1[0]);
            int rightval = Integer.valueOf(s1[1]);
            arr.add(new Node(leftval,rightval));
        }
        //把第一张海报贴到墙上
        ArrayList<ArrayList<Node>> Wall = new ArrayList<ArrayList<Node>>();
        ArrayList<Node> poster1 = new ArrayList<Node>();
        poster1.add(arr.get(0));
        Wall.add(poster1);
        //每加入一张海报，先对墙上的每一个海报段求补集，修改原来的海报段露出的部分的区间
        for(int i=1;i<arr.size();i++) {//新加入的海报
            for(int j=0;j<Wall.size();j++) {//已经贴好的每一张海报
                int index = Wall.get(j).size();
                for(int k=0;k<index;k++) {//每张海报段
                    ArrayList<Node> newPosterDuan = Overlap
                            (Wall.get(j).get(k),arr.get(i));//老海报段对新海报的补集
                    if(newPosterDuan==null) {
                        Wall.get(j).set(k,null);
                    }else {
                        Wall.get(j).remove(k);
                        for(int m=0;m<newPosterDuan.size();m++) {
                            Wall.get(j).add(k,newPosterDuan.get(m));
                        }
                    }
                }
            }
            ArrayList<Node> temp =new ArrayList<Node>();//加入新海报
            temp.add(arr.get(i));
            Wall.add(temp);
        }
        //求总的不为空的海报数量
        int count = 0;
        for(int i=0;i<Wall.size();i++) {
            boolean flag = false;
            ArrayList<Node> temp = Wall.get(i);
            for(int k=0;k<temp.size();k++) {
                if(temp.get(k)!=null) {
                    flag = true;
                }
            }
            if(flag==true) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static ArrayList<Node> Overlap(Node node1,Node node2) {//求node1的补集
        ArrayList<Node> newPosterDuan = new ArrayList<Node>();
        if(node1==null) {
            return null;
        }
        if(node1.left>=node2.left && node1.right<=node2.right ) {
            return null;
        }
        else if(node1.left<=node2.left && node1.right<=node2.right &&
                node2.left<=node1.right) {
            node1.right = node2.left;
            if(node1.left!=node1.right) {
                newPosterDuan.add(node1);
            }
        }else if(node1.left<=node2.right&&node1.left>=node2.left&&
                node1.right>=node2.right) {
            node1.left = node2.right;
            if(node1.left!=node1.right) {
                newPosterDuan.add(node1);
            }
        }else if(node1.left<=node2.left&&node1.right>=node2.right) {
            Node newNode1 = new Node(node1.left,node2.left);
            Node newNode2 = new Node(node2.right,node1.right);
            if(node1.left!=node1.right) {
                newPosterDuan.add(newNode1);
            }
            if(node2.left!=node2.right) {
                newPosterDuan.add(newNode2);
            }
        }else {
            newPosterDuan.add(node1);
        }
        return newPosterDuan;
    }
}
class Node{
    int left;
    int right;
    public Node(int left,int right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public String toString() {
        return "Node [left=" + left + ", right=" + right + "]";
    }
}