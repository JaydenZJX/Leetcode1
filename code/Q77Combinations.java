

import java.util.List;

/**
 *BackTracking
 *
 */


public class Solution{
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> combines = new ArrayList<List<Integer>>();

        helper(combines,new ArrayList<Integer>(),1,n,k);

        return combines;
    }

    public void helper(List<List<Integer>> combines, List<Integer> combine, int start,int n, int k){
        if(k == 0){
            combines.add(new ArrayList<Integer>(combine));
            return;
        }

        for(int i = start; i <= n;i++){
            combine.add(i);
            helper(combines,combine,i+1,n,k-1);
            combine.remove(combine.size()-1);
        }
    }
}
