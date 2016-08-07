/**
 *
 */

public class Solution{
    public int minimumTotal(List<List<Integer>>triangle){
        int[] ans = new int[triangle.size()+];

        for(int i = triangle.size()-1; i>=0; i--){
            for(int j = 0; j<triangle.get(i).size();j++){
                ans[j]=Math.min(ans[j],ans[j+1])+triangle.get(i).get(j);
            }
        }
        return ans[0];
    }
}

//O(n^2)  space O(1);
public int minmumTotal(List<List<Integer>> triangle){
    for(int i= triangle.size()-1; i >= 0; i--){
        for(int j= 0; i< i+1； j++){
            int old = triangle.get(i).get(j);
            triangle.get(i).set(j,old+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
        }
        return triangle.get(0).get(0);
    }
}
