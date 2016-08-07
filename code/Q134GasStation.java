/**
 *greedy
 */

///worest case O(n^2);

public class Solution{
    public int canCompleteCircuit(int[] gas, int[] cost){

        int total_cost = 0;
        int sum = 0, res=0;

        for(int i = 0; i < gas.length; i++ ){
            sum+= gas[i] - cost[i];
            total_cost+= sum;
            if(sum < 0){
                sum = 0;

                res = i+1;
            }
        }

        return total_cost < 0? -1 : res;
    }
}
