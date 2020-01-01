public class OverHalf {

        public int MoreThanHalfNum_Solution(int [] array) {
            if(array==null || array.length==0){
                return 0;
            }
            if(array.length==1){
                return array[0];
            }
            int index = array[0];
            int count = 1;
            for(int i =1;i<array.length;i++){
                if(index==array[i]){
                    count++;
                }else{
                    if(count==0){
                        index=array[i];
                        count++;
                    }else{
                        count--;
                    }
                }
            }
            count = 0;
            for(int i=0;i<array.length;i++){
                if(index==array[i]){
                    count++;
                }
            }
            if(count<=array.length/2){
                return 0;
            }
            return index;
        }


}
