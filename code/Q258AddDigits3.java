/**
 *mood 取各位 /取十位数以上的;
 */

public class Solution{
    public int addDigits(int num){
        while(num/10 >0){
            int sum=0;
            while(num > 0){
                sum+= num %10;
                num/= 10;
            }
            num= sum;
        }
        return num;

    }
}

public class Solution{
    public int addDigits(int num){
        return (num - 1) % 9 +1;
    }
}
