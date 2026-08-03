class Solution {
    public int[] productExceptSelf(int[] nums) {
    
      int ans[]=new int[nums.length];
     ans[0]=1;
     int n=nums.length;
     
      for(int i=1;i<nums.length;i++)
      { 
        ans[i]=ans[i-1]*nums[i-1];   
      }
   
     int s=1;
      for(int i=n-2;i>=0;i--)
      { s*=nums[i+1];
        ans[i]*=s;
  
      }
      
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
