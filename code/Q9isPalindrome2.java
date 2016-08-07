public class Solution {
    public boolean isPalindrome(int x){
        if(x<0 ||(x!=0 && x % 10 ==0)) return false;
        int reverse=0;
        while(x>reverse){
            int tail= x%10;
            reverse=10*reverse+tail;
            x =x /10;
        }
        return (reverse==x ||x==reverse/10);
    }
}
