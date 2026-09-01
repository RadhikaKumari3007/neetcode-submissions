class Solution {
    public List<String> commonChars(String[] words) {
        int[] count =new int[26];
        for(char c:words[0].toCharArray())
        {
            count[c-'a']++;

        }
        for(int i=1;i<words.length;i++)
        {
            int[] current=new int[26];
          for( char c:words[i].toCharArray()){
            current[c-'a']++;
          }
        
        for(int j=0;j<26;j++)
        count[j]=Math.min(count[j],current[j]);
        }
        List<String>  ans=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            while(count[i]>0){
                ans.add(String.valueOf((char)(i+'a')));
                count[i]--;

            }
        }
        return ans;

        
    }
}