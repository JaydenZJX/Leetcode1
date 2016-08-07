public class Solution {
    public int numDecodings(String s) {
        if(s.length()==0 || s==null||s.compareTo("0")==0) return 0;

        if(s.length()>=2 && s.charAt(0)=='0') return 0;

        int r1 =1, r2=1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0') r1=0;

            if(s.charAt(i-1)=='1' || s.charAt(i-1)=='2' && s.charAt(i)<='6'){
                r1=r2+r1;
                r2=r1-r2;
            }else{
                r2=r1;
            }
        }
        return r1;
    }
}
