///
//
//
//
//two pass
public class Solution{
    public void sortColors(int[] nums){
        int num0=0, num1=0,num2=0;

        for(int i =0; i < nums.length;i++){
            if(nums[i]==0) nums0++;
            else if(nums[i]==1) nums1++;
            else if(nums[i]==2) nums2++;
        }

        for(int i=0;i<num0;i++) nums[i]=0;
        for(int i=num0;i<num1; i++) nums[i]=1;
        for(int i=num1+num0; i<nums.length;i++) nums[i]=2;
    }
}

///one pass;

public void sortColors(int[] nums){
    int p1 = 0, p2 = nums.length-1, index = 0;

    while(index <= p2){
        if(nums[index] == 0){
            nums[index]=nums[p1];
            nums[p1]=0;
            p1++;
        }

        if(nums[index] ==2){
            nums[index] = nums[p2];
            nums[p2] = 2;
            p2--;
            index--;
        }
        index++;
    }
}
