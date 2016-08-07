/**
 *1.投票法 时间复杂度 O（N）空间复杂度 O(1);
 *2. hash map 时间 O(n) 空间也是 O(n)
 *3. 随即法。 sort 对折 取 index n/2
 */
public class Solution{
    public int majorityElement(int[] nums){
        int len= nums.length;
        int tmp=0;
        int times=0;
        for(int i = 0; i <len; i++){
            if(times == 0){
                tmp= nums[i];
            }
            if(tmp == nums[i]){
                times++;
            }else{
                times--;
            }
        }
        return tmp;
    }
}
