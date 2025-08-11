class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
         int l = 0; 
         int result = 0 ; 
         for(int r = 0; r<s.length(); r++){
            while(map.contains(s.charAt(r))){
                map.remove(s.charAt(l));
                l++;
                
            
            }
        map.add(s.charAt(r));
        result = Math.max(result, r-l+1);
}

         return result;

    }
}

