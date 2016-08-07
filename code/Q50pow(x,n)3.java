/**
 *考虑 正负 n
 */

public class Solution{
    public double myPow(double x, int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            n=-n;
            x=1/x
        }

        if(n % 2 != 0){
            return x* myPow(x*x,n/2);
        }

        return myPow(x*x,n/2);
    }
}
//34.00515
//    -3 interger MIN_VALUE 不能 compute
public class Solution{
    public double myPow(double x, int n){
        if(n<0){
            return 1/pow(x,-n);
        }
        return pow(x,n);

    }

    public double pow(double x, int n){
        if(n==0){
            return 1;
        }

        double sum= pow(x, n/2);

        if(n%2 ==0){
            return sum*sum;
        }

        return sum*sum*x;
    }
}
////// 第一种优化之后，但是不是最好的
public double myPow(double x, int n) {

    if (x == 0.0 || x == 1.0)   // special case, 0^n = 0, 1^n = 1 
        return x;

    if (n == 0)                 // special case 2, x^0 = 1
        return 1.0;
    else if (n < 0) {

        // special case for MIN_VALUE since -MIN_VALUE = MAX_VALUE+1
        if (n == Integer.MIN_VALUE)
            return myPow(x, n+1)/x;
        else 
            return 1.0/myPow(x, -n);
    }
    else if (n == 1) // special case, base case, x^1 = x
        return x;
    else if (n % 2 == 0) {      // common case, n is even, n=n/2+n/2, x^n = (x^(n/2))^2
        double ret = myPow(x, n/2);
        return ret*ret;
    }
    else  {                      // common case, n is odd, n=n/2+n/2+1, x^n = (x^(n/2))^2*x
        double ret = myPow(x, n/2);
        return x*ret*ret;
    }
}
