/**
 *1. visit all elements;
 *2. a set the proprty of set can not contain dupilicate element;
 */

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums== null || nums.length == 1 || nums.length==0) return false;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]== nums[j])
                    return true;
            }
        }
        return false;
    }
}


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer> ();
            for(int i : nums){
                if(set.contains(i)){
                    return true;
                }
                set.add(i);
            }
        return false;
    }
}
