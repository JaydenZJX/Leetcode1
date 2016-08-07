/**
 *最慢 O(N^2)
 *最快 O(nlogn)
 *{"heabc","heqzd","hede"} => he
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null) return ""; //假设在空的直接return empty  str;
        if(strs.length==1) return strs[0];//如果只有一个 string 在array 里面就是直接return
        String lcp=findlongestCommonPrefix(strs[0], strs[1]);//上面检查完 array index 0 1 都不是 empty 直接叫 find longest Prefix;

        for(int index=2; index<strs.length; index++){
            lcp=findlongestCommonPrefix(lcp,strs[index]);
        }
        return lcp;
    }
    public String findlongestCommonPrefix(String s1, String s2){
        StringBuilder string =new StringBuilder();
        int length=Math.min(s1.length(),s2.length());
        for(int index=0;index<length;index++){
            if(s1.charAt(index)!=s2.charAt(index)){
                break;
            }
            string.append(s1.charAt(index));
        }
        return string.toString();
    }
}
