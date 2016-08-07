import com.sun.media.sound.RIFFInvalidDataException;
import com.sun.xml.internal.bind.v2.runtime.LeafBeanInfoImpl;

/**
 *
 *binary search
 */

public class Solution{
    public int[] searchRange(int [] nums , int target){
        int[] res = {-1,-1};

        int left =0;
        int right = nums.length-1;

        while(nums[left] < nums[right]){
            int mid = left + (right - left)/2;

            if(nums[mid] > target)
                right = mid -1;
            else if(nums[mid] < target)
                left = mid + 1;
            else{
                if(nums[left] == nums[mid]){
                    right--;
                }else{
                    left++;
                }
            }

            }
        if(nums[left] == nums[right] && nums[left] == target){
            res[0] = left;
            res[1] = right;
        }

        return res;
    }

}
