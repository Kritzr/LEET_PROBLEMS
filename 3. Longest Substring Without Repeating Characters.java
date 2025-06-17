class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> mp = new HashSet<>();
        //two pointers as for sliding window
        int left = 0;
        int result = 0;
        for(int right =0; right<s.length(); right++){
            while(mp.contains(s.charAt(right))){
                mp.remove(s.charAt(left));
                left++;
            }

            mp.add(s.charAt(right));
            result = Math.max(result, right - left+1);
        }
        return result;
    }
}
