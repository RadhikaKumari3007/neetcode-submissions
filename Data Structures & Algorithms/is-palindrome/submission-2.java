class Solution {
    public boolean isPalindrome(String s) {




      int left=0,right=s.length()-1;
      while(left<right)
      {
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))) left++;
        while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))return false;
        left++;right--;
      } return true;


       /* int left=0; int right=s.length()-1;
        while(left<right)
        {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
            left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
            right--;

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            else
            {
                left++;
                right--;

            }
            
        }
        return true;












        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            
            result.append(Character.toLowerCase(s.charAt(i)));


        }
        String original=result.toString();
        String reversed=result.reverse().toString();

        return original.equals(reversed);
      */


    }
}
