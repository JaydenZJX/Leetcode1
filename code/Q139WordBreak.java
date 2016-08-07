/**
 *2个解法一个是 recur 缺点会超时；
 *可以一优化 用dp 去解决。
 */

public class Solution{
    public boolean wordBreak(String s, Set<String> wordDict){
        if(wordDict.contains(s)) return true;

        boolean flag=false;

        for(int i=1;i < s.length();i++){
            if(wordDict.contains(s.substring(0,i))){
                flag = wordBreak(s.substring(i),wordDict);
            }
        }
        return flag;
    }
}

/*
 *一个字符串S，它的长度为N，如果S能够被“字典集合”（dict）中的单词拼接而成，那么所要满足的条件为：

 * F(0, N) = F(0, i) && F(i, j) && F(j, N);

 * 这样子，如果我们想知道某个子串是否可由Dict中的几个单词拼接而成就可以用这样的方式得到结果（满足条件为True, 不满足条件为False）存入到一个boolean数组的对应位置上，这样子，最后boolean 数组的最后一位就是F(0, N)的值，为True表示这个字符串S可由Dict中的单词拼接，否则不行！
 */

public class Solution{
    public boolean wordBreak(String s, Set<String> wordDict){
        if(s == null && wordDict == null) return true;

        if(s == null || wordDict == null) return false;

        boolean[] dp = new boolean[s.length()+1];

        dp[0]= true;

        for(int i=1;i<=s.length();i++){
            for(int j=0; j<i;j++){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()]
    }
}
