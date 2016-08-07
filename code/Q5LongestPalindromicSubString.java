/**
 *question longest Palindromic Substring
 *Considsder three ways
 *1.暴力解法 没见过 O(n^3) space O(1)
 *2.Dp 解法 O(n^2) O(n)
 *3.O(n^2) O(1)
 */
public class Solution {
    public String longestPalindrome(String s) {
        int start=0, end=0;
        for(int i=0, i < s.length();i++)
            {
                int len1=expandAroundCenter(s,i,i);//check the situation of "aba" only have single value whenthe point you want retrun something;
                int len2=expandAroundCenter(s,i,i+1);// chenck the situation of the "abba" two double indentical elements on the middle;
                int len=Math.max(len1,len2);
                if(len>end-start)
                {
                    start=i-(len-1)/2;
                    end=i+len/2;
                }
            }
        return s.substring(start,end+1);

    }

    private int expandAroundCenter(String s, int left, int right)
    {
        while(left>0 && right<s.length() &&  s.charAt(left)== s.charAt(right))
            {
                left--;
                right++;
            }
        return right-left-1; // 有个－1 会增加一个index －1 返回；
    }
}
//Given a string S, find the longest palindromic substring in S. You may assume that//the maximum length of S is 1000, and there exists one unique longest palindromic ///substring.
