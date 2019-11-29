public class SubString {

    public boolean[] chkSubStr(String[] p, int n, String s) {

        boolean [] str=new boolean[n];
    for (int i = 0; i < p.length; i++) {
        int result = s.indexOf(p[i]);

        if(result!=-1){
            str[i]=true;

        }
        else{
            str[i]=false;
        }
    }
    return  str;
    }










        // write code here
       /* boolean []   str={};
        for (int i = 0; i < p.length; i++) {
       boolean status=s.contains(p[i]);
       str[i]=status;
        }
return  str;
    }*/
}
