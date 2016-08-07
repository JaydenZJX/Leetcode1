/**
 *trim() omited the white space
 *split() regex "\\s+"
 ********
 *解法主要是把 s converse 成一个 array list 然后
 *从最后面加回来.
 */
public class Solution{
    public String reverseWords(String s){
        String [] parts=s.trim().split("\\s+");
        String out="";
        int len=parts.length-1;
        for(int i=len;i>0;i--){
            out+=parts[i]+"";
        }
        return out + parts[0];
    }
}
