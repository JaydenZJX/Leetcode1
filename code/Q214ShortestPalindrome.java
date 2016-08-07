

public class Solution{
    public String shortestPalindrome(String s){
        int i = 0;
        int end = s.length() - 1;
        int j = end;
        char chs[] = s.toCharArray();

        while(i < j){
            if(chs[i] == chs[j]){
                i++;
                j--;
            }else{
                i = 0;
                end--;
                j=end;
            }
        }

        return new StringBuilder(s.substring(end+1)).reverse().toString()+s;
    }
}
