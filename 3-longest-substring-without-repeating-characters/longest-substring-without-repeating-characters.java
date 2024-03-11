class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0; 
        int b = 0; 
        int longest = 0;

        HashSet<Character> substring = new HashSet(); 

        while (b < s.length()){
            if (!substring.contains(s.charAt(b))){
                substring.add(s.charAt(b)); 
                b++; 
                longest = Math.max(substring.size(), longest);
            } else {
                substring.remove(s.charAt(a));
                a++; 
            }
        }

        return longest; 
    }
}