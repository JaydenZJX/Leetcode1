/**
 *sort  O(n log n);
 *
 *has map O(n);
 */

public class Solution{
    public int longestConsecutive(int[] nums){
        int ans = 0;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int n :nums){
            if(!map.containsKey(n)){
                int left=(map.containsKey(n-1))? map.get(n-1) : 0;
                int right=(map.containsKey(n+1))? map.get(n+1) :0;

                int sum = left+right+1;
                map.put(n,sum);
                ans = Math.max(ans,sum);

                //update the booke keeping;
                //perepare for the next consecutive element;
                map.put(n-left,sum);
                map.put(n+right,sum);
            }else{
                continue;
            }
        }
        return ans;
    }
}
