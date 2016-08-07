

/**
 *
 *
 */

public class Solution{
    public int candy(int[] rating){
        int res = 0;
        int[] result = new int[rating.length];

        Arrays.fill(result, 1);

        for(int i = 0; i < rating.length-1; i++){
            if(rating[i] < rating[i+1]) result[i+1] = result[i]=1;
        }

        for(int i = rating.length-1; i > 0 ; i--){
            if(rating[i-1] > rating[i]) result[i-1] = max(result[i]+1,result[i-1]);
        }

        for(int i: result){
            res+= i
        }

        return res;
    }
}
