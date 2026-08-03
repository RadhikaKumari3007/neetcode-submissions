class Solution {
    public int[] productExceptSelf(int[] nums) {
      //  HashMap<Integer,Integer> map=new HashMap<>();
      int result[]=new int[nums.length];
        int ans=1;
        for(int i=0;i<nums.length;i++)
        { 
             for(int j=0;j<nums.length;j++)
           {  if(i!=j)
               ans*=nums[j];
           }
              // ans=ans/nums[i];
               result[i]=ans;
              ans=1;
        }
        return result;
    }
}  
