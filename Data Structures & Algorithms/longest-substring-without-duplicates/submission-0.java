class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndex = new HashMap<>();
                int start = 0;
                        int maxLen = 0;

                                for (int end = 0; end < s.length(); end++) {
                                            char c = s.charAt(end);
                                                        if (charIndex.containsKey(c) && charIndex.get(c) >= start) {
                                                                        start = charIndex.get(c) + 1;
                                                                                    }
                                                                                                charIndex.put(c, end);
                                                                                                            maxLen = Math.max(maxLen, end - start + 1);
                                                                                                                    }

                                                                                                                            return maxLen;
        
    }
}
