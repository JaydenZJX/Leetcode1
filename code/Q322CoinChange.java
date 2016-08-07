


public class Solution{
    public int coinChange(int[] coins, int amount){
        int total = 1;
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        while(total <= amount){
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < coins.length; i++){
                int deff = total - coins[i];

                if(deff > 0 && dp[deff] > 0 || deff ==0){
                    min = Math.min(min, dp[deff]+1);
                }
            }
            dp[total] = (min == Integer.MAX_VALUE? -1:min);
            total++;
        }

        return dp[amount];
    }
}
