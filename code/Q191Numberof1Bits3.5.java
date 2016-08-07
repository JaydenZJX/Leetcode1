/**
 *bit shiffting /// 0 true 1 false;
 *     001     001
 *    &010    &001
 *-----------------
 *     000     001 <--represent int 1
 * '>>>' test is there still have a number or value after
 * we shifft bits
 */
public class Solution{
    public int hammingWeight(int n){
        int number= 0;
        while(n != 0 ){
            number=number+(n & 1);
            n=n>>>1;
        }
        return number;
    }
}


