class Solution {
    public int[] productExceptSelf(int[] nums) {
      int prefix[]=new int[nums.length];
      int suffix[]=new int[nums.length];
      int ans[]=new int[nums.length];
     prefix[0]=1;int n=nums.length;
      int j=0;//int p=1;
      for(int i=1;i<nums.length;i++)
      {  
        prefix[i]=prefix[i-1]*nums[i-1];   
      }
     suffix[n-1]=1;//p=1;
      for(int i=n-2;i>=0;i--)
      {
        suffix[i]=suffix[i+1]*nums[i+1];
  //      p=suffix[i];
      }
      for(int i=0;i<n;i++)
      ans[i]=prefix[i]*suffix[i];
      return ans;
















      //  HashMap<Integer,Integer> map=new HashMap<>();
      /*int result[]=new int[nums.length];
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


      */
    }
}  
