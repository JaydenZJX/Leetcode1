/**
 *算法，注意 int upbound 检查 基本个reverse intger 思路差不多。
 */
public class Solution {
    public static int myAtoi(String str) {
        int index=0;
        int sum=0;
        int sign=1;
        if(str.length() == 0) return 0;
        // check space
        while(index<str.length() && str.charAt(index)==' '){
            index++;
        }
        if(str.charAt(index)=='+' || str.charAt(index)=='-'){
            sign= str.charAt(index)=='+'? 1:-1;
            index++;
        }

        while(index<str.length()){
            int digit= str.charAt(index)-'0';
            if(digit<0 ||digit>9) break;
            if(sum >Integer.MAX_VALUE/10 || Integer.MAX_VALUE/10==sum && Integer.MAX_VALUE %10 < digit){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            sum=sum*10+digit;

            index++;
        }
        return sum*sign;

    }
}
