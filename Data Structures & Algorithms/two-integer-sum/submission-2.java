class Solution {
    public int[] twoSum(int[] nums, int target) {
     /*    for(int i=0;i<nums.length;i++)
        { 
          for(int j=i+1;j<nums.length;j++)
          if(nums[i]+nums[j]==target)
          return new int[] {i,j};
        }
        return new int[] {};
        */
        HashMap<Integer, Integer> map=new HashMap<>(); int c=0,d=0,i,k=0;

        //for(Map.Entry<Integer,Integer> e: map.entrySet())
            for( i=0;i<nums.length;i++){
            c=target-nums[i];
            if(map.containsKey(c))
            {
                d=map.get(c);break;
            }
            map.put(nums[i],i);
         }
         return new int[] {d,i};

    }
}
