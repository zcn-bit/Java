public class MethodTypes {
    //用N个2*1的小矩形覆盖2*n的大矩形，有多少种方法？

        public int RectCover(int target) {
            if(target  <= 1){
                return 1;
            }
            if(target*2 == 2){
                return 1;
            }else if(target*2 == 4){
                return 2;
            }else{
                return RectCover((target-1))+RectCover(target-2);
            }
        }


}
