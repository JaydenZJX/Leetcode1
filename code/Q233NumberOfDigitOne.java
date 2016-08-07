


/**
 *
 */

public class Solution{
    public int contDigitOne(int n){
        int ones = 0;

        for(int i = 1, i <= n; i= i*10){
            ones+= (n/i + 8) / i + ( n/i % 10 == 1? n%i+1:0)
        }
    }
}
