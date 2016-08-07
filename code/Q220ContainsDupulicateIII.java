

import java.util.TreeSet;

/**
 *
 *TreeSet;
 */
public class Solution{
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t){

        if(k <1 || t <0)
            return false;

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < nums.length; i++){

            int n = nums[i];
            if(set.floor(n) != null && n - set.floor(n) <=t ||
               set.ceiling(n) != null && set.ceiling(n)-n <= t)
                return true;
            set.add(n);
            if(i >= k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}