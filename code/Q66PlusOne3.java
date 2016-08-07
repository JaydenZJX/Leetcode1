/**
 *
 */

public class Solution{
    public int[] plusOne(int[] digits){
        int len= digits.length-1;
        for(int i=len;i>=0;i--){
            if(digits[i] < 9){
                digits[i]+=1;
                break;
            }else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int [] newdigits= new int[len+2];// digits.length+1;
            newdigits[0]=1;
            return newdigits;
        }
        return digits;
    }
}

/**********************************************/
public class Solution{
    public int[] plusOne(int[] digits){
        int len= digits.length-1;
        for(int i=len;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newNumber = new int[len+2];//digits.length+1;
        newNumber[0]=1;
        return newNumber;
    }
}
