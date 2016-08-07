/**
 * charAt －'@' 就是它在 26个字母中的排序位子；
 */

public class Solution{
    public int titleToNumber(String s){
        int result==0;

        for(int i=0 ;i < s.length();i++){
            result=result*26+(s.charAt(i)-'@');
        }
        return result;
    }
}
