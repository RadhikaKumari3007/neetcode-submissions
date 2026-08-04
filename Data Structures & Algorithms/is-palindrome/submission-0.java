class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            
            result.append(Character.toLowerCase(s.charAt(i)));


        }
        String original=result.toString();
        String reversed=result.reverse().toString();

        return original.equals(reversed);



    }
}
