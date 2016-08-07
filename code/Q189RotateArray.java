/**
 *Rotate;
 *1.开两个 array 0-K k+1-nums.length 分组；
 *   1.1再开一个 和一个nums.length 的array 重组；
 *2.将数组分两端 前一段 n－k k+1 －nums.length;
 *   2.1 分组reverse 最后 整个数组reverse；
 */

public class Solution{
    public void rotate(int[] nums, int k){
        int len= nums.length;

        k%=len;
        reverse(nums,0,len-k);
        reverse(nums,len-k,len);
        reverse(nums,0,len);
    }
    public void reverse(int[] nums,int begin,int end){
        int left = begin;
        int right= end-1;
        while(left<right){

            int tmp= nums[left];
            nums[left]=nums[right];
            nums[right]=tmp;
            left++;
            right--;
        }
    }
}
