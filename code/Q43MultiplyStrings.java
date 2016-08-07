/**
 *这道题属于数值操作的题目，其实更多地是考察乘法运算的本质。
 基本思路是和加法运算还是近似的，只是进位和结果长度复杂一些。
 我们仍然是从低位到高位对每一位进行计算，假设第一个数长度是n，
 第二个数长度是m，我们知道结果长度为m+n或者m+n-1（没有进位的情况）。
 对于某一位i，要计算这个位上的数字，我们需要对所有能组合出这一位结果
 的位进行乘法，即第1位和第i位，第2位和第i-1位，... ，然后累加起来，
 最后我们取个位上的数值，然后剩下的作为进位放到下一轮循环中。
 这个算法两层循环，每层循环次数是O(m+n)，所以时间复杂度是O((m+n)^2)。
 算法中不需要额外空间，只需要维护一个进位变量即可，所以空间复杂度是O(1)。代码如下：
*/

public class Solution{
    public String multiply(String num1, String num2){
        int len1 = num1.length();
        int len2 = num2.length();

        int[] nums = new int[len1+len2];

        for(int i = len1 - 1;i >= 0;i--){
            for(int j = len2 -1;j >= 0;j--){
                int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int p1 = j + i, p2 = j + i +1;

                int sum = mul + nums[p2];


                nums[p1]+= sum / 10;
                nums[p2] = sum % 10;

            }
        }

        StringBuilder str = new StringBuilder();

        for(int i : nums) if(!(str.length() == 0  && i == 0)) str.append(i);
        //for(int p : pos)if(!(sb.length () == 0 && p == 0)) sb.append(p);



        return str.length() == 0 ? "0" : str.toString();
    }
}
