/**
 * 先找出从左边出发的最大高度； 在找右边出发的最大高度
 *O(n) O(n) ;
 *******
 *从中间出发往两边找；
 ＊O(n) O(1);
*/

public class Solution{
    public int trap(int[] height){
        int len=height.length;

        int[] left_peek = new int[len];
        int[] right_peek = new int[len];

        for(int i=1; i<len; i++){
            left_peek[i]=Math.max(left_peek[i-1],height[i-1]);
        }

        for(int i= len-2;i>=0;i--){
            right_peek[i]=Math.max(right_peek[i+1],height[i+1]);
        }

        int sum=0;

        for(int i=0; i< len;i++){
            int h=Math.min(left_peek[i],right_peek[i]);
            if(h>height[i]){
                sum+=h-height[i];
            }
        }

        return sum;

    }
}
