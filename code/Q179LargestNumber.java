import java.util.*;

public class Solution{
    public String largestNumber(int[] nums){
        StringBuilder res = new StringBuilder();
        if(nums==null || nums.length==0) return res.toString();

        String[] str= new String[nums.length];
        for(int i =0; i<nums.length;i++){
            str[i]=nums[i];
        }

        Comparator<String> order= new Comparator<String>(){
                public int compare(String s1,String s2){
                    return Long.compare(Long.valueOf(s2+s1), Long.valueOf(s1+s2));
                }
            };
        Arrays.sort(str,order);
        if(str[0].equals("0")) return "0";
        for(String s :str){
            res.append(s);
        }

        return res.toString();
    }
}
