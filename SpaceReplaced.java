public class SpaceReplaced {
    public String replaceSpace(String iniString, int length) {
        // write code here
StringBuffer stringBuffer=new StringBuffer();//线程安全的
        for(int i=0;i<length;i++){
            char ch=iniString.charAt(i);
            if(ch==' '){
                stringBuffer.append("%20");

            }else{
                stringBuffer.append(ch);
            }

        }
        return stringBuffer.toString();
    }
}
