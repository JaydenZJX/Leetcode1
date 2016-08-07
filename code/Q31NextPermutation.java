/**
 *
 *解法：
 找到最长的decreasing subarray，必须以数组结尾为结尾
 然后找到刚好比nums[idx]大的元素和nums[idx]，swap下
 再reverse下

 例子如下：
 nums=[2,4,7,5,3,1]
 找到最长的递减subarray，返回idx=1
 在[7,5,3,1]里刚好比4大的元素是5，所以互换4和5，得到[2,5,7,4,3,1]
 然后反转[7,4,3,1]，得到[2,5,1,3,4,7]

 此题考的是，简洁的代码+对字典序的理解
 */

public class Solution{
    public void nextPermutation(int[] nums){
        int index = findLonggestDecSubarray(nums);

        if(index >=0){
            swap(nums, index, findLarger(nums, index));
        }
        reverse(nums, index+1,nums.length-1);
    }

    public int findLonggestDecSubarray(int[] nums){
        //find longgest dec subarring
        //and return the indx of element before
        //the Dec Subarray;
        int end=nums.length-1;

        while(end >= 0){
            if(end < nums.length-1 && nums[end] < nums[end+1])
                break;
            end--;
        }

        return end;
    }

    public int findLarger(int[] nums, int end){
        //find a num larger than targert number from
        //dec Sub array and return a index;
        int target = nums[end];

        for(int i = nums.length - 1 ; i > end ; i--){
            if(nums[i] > target)
                return i;
        }

        return -1;
    }

    public void swap(int[] nums, int index1, int index2){
        int tmp = nums[index1];

        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }
}
