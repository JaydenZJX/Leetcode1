/**
 *
 * sort
 ＊queue
 ＊quick sort/
*/

public class Solution{
    public int findKthLargest(int[] nums, int k){
        return qSorte(nums, k , 0, nums.length - 1);
    }

    public int qSorte(int[] nums,int k, int start, int end){
        int i = start, j = end;
        int x = start + (int)(Math.random()*(end - start + 1));

        int pivot = nums[x];
        nums[x] = nums[end];

        while(i < j){
            while(i < j && nums[i] < pivot) i++;

            if(i < j)
                nums[j] = nums[i];
            else
                break;

            while(i < j && nums[j] >= pivot) j--;

            if(i<j)
                nums[i] = nums[j];
            else
                break;
        }

        if(end - i + 1 == k)
            return pivot;

        else if(end - i +1 > k)
            return qSorte(nums,k, i+1, end);
        else
            return qSorte(nums, k - end + i -1, start , i-1);
    }
}
