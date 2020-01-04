public class AppearOneChar {


        public int FirstNotRepeatingChar(String str) {
            int[] word = new int[58];
            for(int i = 0;i<str.length();i++){
                word[(int)str.charAt(i)-65]+=1;
            }
            for(int i = 0;i<str.length();i++){
                if(word[(int)str.charAt(i)-65]==1)
                    return i;
            }
            return -1;
        }
    }

