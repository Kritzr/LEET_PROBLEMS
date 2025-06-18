class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        HashSet<Character> charmap = new HashSet<>();
        for(char c: s.toCharArray()){
            charmap.add(c);
        }
        //hashset t calculate the number of occurances

        for(char c:charmap){
            int count =0, left = 0;
            for(int right =0; right <s.length();right++){
                if(s.charAt(right)==c){
                    count++;
                }
//window size - count [c] = number of characters to change <= k
                while((right-left +1) - count > k){
                    if(s.charAt(left) == c){
                        count--;
                    }
                    left++;
                }
                result = Math.max(result, right-left+1);
            }
        }
        return result;
    }
}