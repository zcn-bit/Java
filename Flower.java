public class Flower {

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
int hundred=i/100;
int decade=(i/10)%10;
int unit=i%10;
if(i==hundred*hundred*hundred+decade*decade*decade+unit*unit*unit){
    System.out.println(i);
}
        }
    }
}
