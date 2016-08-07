
/**
 *
 *规律 最后一定是 余1.
 */

public class Solution {
    public boolean isUgly(int num) {
        if(num == 1)
            return true;
        if(num <=0)
            return false;
            
        return 1 == helper(3,helper(5,helper(2,num)));
    }
    
    public int helper(int d, int n){
        if(n%d == 0){
            return helper(d,n/d);
        }
        System.out.println(n);
        return n;
        
    }
}


//******

public class Solution{
    public boolean isUgliy(int num){
        for(int i = 2; i<6; i++){
            while(num % i == 0){
                num /=i;
            }
        }

        return num ==1 ;

    }
}
