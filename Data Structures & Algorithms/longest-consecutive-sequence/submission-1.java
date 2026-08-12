class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0)
       return 0;
       int longest=0,length=0;
       HashSet<Integer> set=new HashSet<>();
       for(int n:nums) set.add(n);
       for(int n:nums) 
       {
        if(!set.contains(n-1))
        {
           length=1;
           while(set.contains(n+length)) length++;

        
           longest=Math.max(longest,length);
        }
       }return longest;
















        
       /* if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int n: nums)
        set.add(n);
        int longest=0;
        for(int n:set){
            if(!set.contains(n-1))
            {
                int length=1;
                while(set.contains(n+length)){
                    length++;

                }
                longest=Math.max(longest,length);
            }
        }
        return longest;*/
    }
}
