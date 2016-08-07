/*解题思路：
*1.看清题目是3sum 还是2sum
*2.becarefully with the question asking for is star from 0 base or something else
*3.if that is two sum should come up with hash map solution;
*4.on the line 18: result[1]=i sometime could be i+1 depend how the
*question ask for.
*此题不需要一开始就给出hash map solution 如果你要从 最笨的方法开始一步步优化
*比如说你从2个loop 开始第二个loop的indext based on 第一个loop的nidex
*一直找下去,复杂程度应该是O(n^2)如果用2个loop.
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap <Integer, Integer> mymap = new <Integer,Integer> HashMap();
        //int[] newnums=Arrays.sort(nums);
        for (int i=0; i<nums.length;i++) {
        	if(mymap.containsKey(target - nums[i]))
        	{
        	   result[1]=i;
        	   result[0]=mymap.get(target-nums[i]);
        	   return result;
        	}
        	mymap.put(newnums[i],i);
        }
        return null;
    } 
}
//complexity O(n) casue the loop go throw the n times and check the
//answer while time and the boolean statement just casue O(1) we definitly
//forget about it.
/*优化方法:
 *此题解法应该是快的solution
 *可以从throw exception 解决 当nums.length ==0时 直接return empty result
 */

//*************
/*three sume 解法
//*************
/*最笨的方法 3loop 解决 O(n^3)
* 最快的方法：使用的Arrays.sort(num)
*指针从两头开始指向中间,有点想binary search.
*实现方法：用while loop 设置 min mid max 3个value  min 从index0 开始
*max index从 nums.length-1(last positon in nums array)
*inner for loop. 检查每个target= min+mid+max 三个数。如果小于 那就是min +1(或者什么之类)
*如果大于 max －1 。。。。 接续检查
＊complexity 应该是O(n^2)

