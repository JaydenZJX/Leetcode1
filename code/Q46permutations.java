/**
 *permutation
 *
 */

public class Solution{
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new  ArrayList<List<Integer>>();

        if(nums.length== 0) return ans;

        List<Integer> initail= new ArrayList<Integer>();

        initail.add(nums[0]);

        ans.add(initail);

        for(int i=1; i<nums.length; i++){

            List<List<Integer>> new_ans = new ArrayList<List<Integer>>();

            for(int j = 0; j<=i; j++){
                for(List<Integer> l : ans){
                    List<Integer> new_l = new ArrayList<Integer>(l);
                    new_l.add(j,nums[i]);
                    new_ans.add(new_l);
                }
            }
            ans=new_ans;
        }
        return ans;
    }
}

public class Solution{
    List<List<Integer> list;

    public List<List<Integer> permute(int[] nums){
        list = new ArrayList<>();

        ArrayList<Integer> perm = new ArrayList<Integer>();

        backTrack(perm,0,nums);

        return list;
    }

    public void backTrack(ArrayList<Integer> perm, int i, int nums){

        if(i==nums.length){
            list.add(new ArrayList(perm));
            return;
        }

        ArrayList<Integer> newperm= new ArrayList<Integer>(perm);
        for(int j=0;i<=i;j++){
            newperm.add(j,nums[i]);
            backTrack(newperm,i+1,nums);
            newperm.remove(j);
        }
    }
}
