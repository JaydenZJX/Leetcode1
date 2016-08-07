public class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        for(int i=0; nums.length;i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}


public class Solution{
    public boolean containsNearbyDuplicate(int[] nums, int k){
        map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0;i < nums.length; i++){
            if(map.contains(nums[i])){
                if(i- map.get(nums[i])<=k){
                    return true;
                }
            }

            map.add(nums[i],i);
        }
        return false;
    }
}
