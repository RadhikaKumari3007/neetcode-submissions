//import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
     List<List<Integer>> ans =new ArrayList<>();
     int n=nums.length;
     for(int i=0;i<n-1;i++)
     {
        if(i>0 && nums[i]==nums[i-1])
        continue;
        int j=i+1;int k=n-1;
        while(j<k)
        {
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<0)
            j++;
            else if(sum>0)
            k--;
            else if(sum==0)
            {
                ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;k--;
                while(j<k && nums[j]==nums[j-1] )
                j++;
                while(j<k && nums[k]==nums[k+1])
              k--;


            }
        }
     } return new ArrayList<>(ans);





















        /*List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int l=i+1,r=nums.length-1;
            while(l<r){
                long sum=(long)nums[i]+nums[l]+nums[r];
                if(sum<0){
                    l++;
                }else if(sum>0) r--;
                else {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
            }
        }
        
        return res;*/
    }
}