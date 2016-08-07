/**
 * iter % /
 *如果不是 happy number 会循环
 */

// O(n) O(n);
public class Solution{
    public boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();
        while(!set.contians(n)){
            if(n == 1) return true;

            int sum=0;
            int tmp;
            while(n>0){
                tmp = n%10;
                sum+=tmp*tmp;
                n/=10;
            }
        }
        return false;
    }
}
// O(n) O(1);
public class Solution{
    public boolean isHappy(int n){
        int x=n, y=n;
        while(x > 1){
            x = getNext(x);
            if( x == 1 ){
                return true;
            }
            y=getNext(getNext(y));
            if(y == 1) return true;

            if(x == y) return false;
        }
        return true;
    }

    public int getNext(int n){
        int x =n;
        int s =0;
        while(x>0){
            s=s+(x%10)*(x%10);
            x=x/10;
        }
        return s;
    }
}
