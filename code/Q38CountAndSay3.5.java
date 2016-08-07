/**
 *stringbuilder
 *O(N!) O(n)
 *
 */
public class Solution{
    public String countAndSay(int n){
        if(n == 0) return "";
        String s="1";
        for(int j=1;j< n;j++ ){
            StringBuilder sb = new StringBuilder();
            char last s.char(0);
            int cnt=1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i) == last){
                    cnt++;
                }else{
                    sb.append(cnt);
                    sb.append(last);
                    last=s.charAt(i);
                    cnt=1;
                }
            }
            sb.append(cnt);
            sb.append(last);
            s=sb.toString();
        }
        return s;
    }
}
/** recur**/

public class Solution{
    public String countAndSay(int n){
        if(n == 0 ) return "";
        if(n == 1 ) retrun "1";

        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        char last = s.charAt(0);
        int cnt =1;
        for(int i= 1;i<s.length();i++){
            if(s.charAt(i) == last){
                cnt++;
            }else{
                sb.append(cnt);
                sb.append(last);
                last= s.charAt(i);
                cent=1;
            }
            sb.append(cnt);
            sb.append(last);
            return sb.toString;
        }
    }
}
