/**
 *amazion 面试题目真题。
 *基于2sum，记本解法差不多.
 */
//最慢的办法 应为 contains 用了 O(n)的时间检查了结果是不是在当前list 里面，
//所以不是很好，不是最优。
//time limited caused;
//所以不是很好，不是最优。
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       // if(nums.length<3 ||nums==null) {
      //      throw new IllegalArgumentException("sdfasdf");
      //  }

        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);
        int len= nums.length;
        for(int index=0;index<len;index++){
            int mid=index+1 , tail=len-1;
            while(mid<tail){
                int target=nums[index]+nums[mid]+nums[tail];
                if(target==0){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(nums[index]);
                    tmp.add(nums[mid]);
                    tmp.add(nums[tail]);
                    if(!result.contains(tmp)){
                        result.add(tmp);
                        tail--;
                        mid++;
                    }
                }else if (target>0){
                    mid++;
                }else{
                    tail--;
                }
            }
        }
        return result;
    }
}
/**
 *检查i 是不是i－1 当i>0 的时候
 *手动检查 用boolean statement
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int len=nums.length;

        for(int i=0; i<len-2; i++){

            if(i==0 ||(i>0 && nums[i] != nums[i-1])){

                int left = i+1, right=len-1, sum=0-nums[i];//sum= nums[i]+nums[left]+nums[right]==0;
            while(left<right){

                if(nums[left]+nums[right]==sum){

                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left<right && nums[right]==nums[right-1]){

                        right-- ;//检查重复；
                    }
                    while(left<right && nums[left]==nums[left+1]){

                        left++;  // 检查重复；
                    }
                    right--;left++;

                }else if (nums[left]+nums[right]<sum){

                    left++;

                }else{

                    right--;
                }
            }

            }

        }
        return result;
    }
}
