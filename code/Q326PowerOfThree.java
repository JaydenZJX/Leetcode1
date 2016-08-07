/**

import java.util.HashSet;

 *https://leetcode.com/discuss/78532/summary-all-solutions-new-method-included-at-15-30pm-jan-8th
 *多种解法；
 *
 *log(243) = 5.493061443340548    log(3) = 1.0986122886681098
 ==> log(243)/log(3) = 4.999999999999999

 log10(243) = 2.385606273598312    log10(3) = 0.47712125471966244
 ==> log10(243)/log10(3) = 5.0
*/

ublic class Solution{
    public boolean isPowerOfThree(int n){
        return (Math.log10(n)/Math.log10(3)) %1 ==0;
    }
}


//
public class isPowerOfThree(int n){
    HashSet<Integer> set= new HashSet<>(Arrays.asList(1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467));

    return set.contains(n);
}
