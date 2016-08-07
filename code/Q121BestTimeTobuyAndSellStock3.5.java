/**
 *1. two pionter O(n) O(1)
 *2. greedy O(n) O(1)
 *3. dynamic O(n) O(n) 不考虑
 */
public class Solution{
    public int maxProfit(int[] price){
        int minPrice= Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<price.length;i++){
            if(price[i]<minPrice){
                minPrice=price[i];
            }
            if(price[i]-minPrice > profit){
                profit=price[i]-minPrice;
            }
        }
        return profit;
    }
}
/************************/
public class Solution{
    public int maxProfit(int[] price){
        int sum = 0, cursum=0;
        for(int i =1;i<price.length;i++){
            cursum = Math.max(0,cursum+=price[i]-price[i-1]);
            sum =Math.max(cursum,sum);
            }
        
        return sum;
    }
}
