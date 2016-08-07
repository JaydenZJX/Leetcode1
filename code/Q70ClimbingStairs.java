/**
 *1. recure O(n^exp) 空间O（1）
 *2. DP O(n) 空间 O(n);
 *3. 推递法 0(n)  O(1)
 */
public class Solution{
    public int climbStairs(int n){
        if(n == 1 ){
            return 1;
        }
        if(n == 2 ){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}

public class Solution{
    public int climbStairs(int n){
        int[] dp = new int [n];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
            System.out.print(dp[1]);
        }
        return dp[n];
    }

}

public class Solution{
    public int climbStairs(int n){
        int a=0, b=1, sum=1;
        for(int i =0;i<n;i++){
            sum=a +b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
