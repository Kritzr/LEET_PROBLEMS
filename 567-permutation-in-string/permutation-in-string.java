class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()> s2.length()){
            return false;
        }

        int[] s1counter = new int[26];
        int[] s2counter = new int[26];

        for(int i =0; i<s1.length();i++){
            s1counter[s1.charAt(i)-'a']++;
            s2counter[s2.charAt(i)-'a']++;
        }
        int matches =0;

        for(int i=0; i<26;i++){
            if(s1counter[i]==s2counter[i]){
                matches++;
            }
        }

        int left = 0;
        for(int right =s1.length(); right<s2.length();right++){
            if(matches ==26){
                return true;
            }

            int index = s2.charAt(right) - 'a';
            s2counter[index]++;
            if(s1counter[index] == s2counter[index]){
                matches++;

            }

            else if (s1counter[index]+1 == s2counter[index]){
                matches--;
            }

            index = s2.charAt(left) - 'a';
            s2counter[index]--;
            if(s1counter[index] == s2counter[index]){
                matches++;

            }

            else if (s1counter[index]-1 == s2counter[index]){
                matches--;
            }

            left++;
        }
        return matches ==26;
    }
}