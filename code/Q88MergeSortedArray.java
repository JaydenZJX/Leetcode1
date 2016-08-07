/**
 *已经假设 nums1 的长度 会大于等于 num1+num2 的总长
 *所以可以从n＋m 的位子开始 选 num[n] num2[m];
 *开始排列；
 */
public class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int tail = n+m-1,tail1=m-1,tail2= n-1;

        while(tail1 != 0 && tail2 !=0){
            if(nums1[tail1]<nums2[tail2]){
                nums1[tail]=nums2[tail2];
                tail2--;
                tail--;
            }else{
                nums1[tail]= nums1[tail1];
                tail--;
                tail--;
            }
        }

        while(tail1>=0){
            nums1[tail]=nums1[tail1];
            tail--;
            tail1--;
        }

        while(tail2>=0){
            num1[tail]=nums2[tail2];
            tail2--;
            tail--;
        }
    }
}
