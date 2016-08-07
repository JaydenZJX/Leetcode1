/**
 *最简单暴力解法 O(n^2);
 *最优解法 O(n^2);
 */
public class Solution{
    public int maxArea(int[] height){
        int left =0, right=height.length-1;
        int Max_area=0;
        while(left<right){
            Max_area=Math.Max(Max_area,Math.Min(height[left],height[right])(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return Max_area;
    }
}
