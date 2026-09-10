class Solution {
    public boolean isAnagram(String s, String t) {
      int n,m;
      n=s.length();m=t.length();
      HashMap<Character,Integer> maps=new HashMap<>();
      HashMap<Character,Integer> mapt=new HashMap<>();

      if(n!=m) return false;
      else
      {
        char[] c=s.toCharArray();
        //for(int i=0;i<n;i++)
      //  {
        //  char c=s.charAt(i);
        
        for(char ch:c)
       { if(maps.containsKey(ch))
        maps.put(ch,maps.get(ch)+1);
        else 
        maps.put(ch,1);
       }

      char[] cc=t.toCharArray();
        //for(int i=0;i<n;i++)
      //  {
        //  char c=s.charAt(i);
        
        for(char ch:cc)
       { if(mapt.containsKey(ch))
        mapt.put(ch,mapt.get(ch)+1);
        else 
        mapt.put(ch,1);
       }


      } return maps.equals(mapt);}}















        /*
        int n,m;
        n=s.length();m=t.length();
        if(n!=m) return false;
        HashMap<Character , Integer> maps= new HashMap<>();char ch;//int c=1;
        HashMap<Character , Integer> mapt=new HashMap<>();
        for(int i=0;i<n;i++)
        {    ch=s.charAt(i);
          
            if(maps.containsKey(ch))
            maps.put(ch,maps.get(ch)+1);
            else
           // maps.put(ch,maps.get(ch)+1);
                maps.put(ch,1);

        }
        for(int i=0;i<m;i++)
        {
            ch=t.charAt(i);

            if(mapt.containsKey(ch))
            mapt.put(ch,mapt.get(ch) +1);
            else 
            mapt.put(ch,1);
        }
        return maps.equals(mapt);
        


    }
}*/
