class Solution {
    public int maxArea(int[] height) {
      int l=0,r=height.length-1;
      int ans=0;
      while(l<r)
      {
        int w=r-l;
        int h=Math.min(height[l],height[r]);
        int cw=w*h;
        ans=Math.max(ans,cw);
        if(height[l]<height[r]) l++;else r--;
      } return ans;
 







     /*int n=height.length;int ans=0;
     for(int i=0;i<n-1;i++)
     {
        for(int j=i+1;j<n;j++)
        { int w=j-i;
          int h=Math.min(height[i],height[j]);
          int area=w*h;
           ans=Math.max(ans,area);

        }
     } return ans;


        int i = 0, j = height.length - 1;
        int maxWater = 0;

        while (i < j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            int area = w * h;
            maxWater = Math.max(maxWater, area);

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxWater;*/
    }
}