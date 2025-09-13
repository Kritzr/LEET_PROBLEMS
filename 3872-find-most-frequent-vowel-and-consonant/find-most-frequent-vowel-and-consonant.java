class Solution {
    public int maxFreqSum(String s) {
        Map< Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c,0)+1);
        }

        int max_vowel = 0;
        int max_nonvowel = 0;

        for(char c: count.keySet()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                max_vowel = Math.max(count.get(c), max_vowel);
            }
            else{
                max_nonvowel = Math.max(count.get(c), max_nonvowel);
            }
        }

        return max_nonvowel+max_vowel;
    }
}