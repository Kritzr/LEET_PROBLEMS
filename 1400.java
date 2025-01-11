class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
            return false;
        }
        int freq[] = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        int oddfreq=0;
        for(int count:freq){
            if(count%2!=0){
                oddfreq++;
            }
        }
        return oddfreq<=k;
    }
}
