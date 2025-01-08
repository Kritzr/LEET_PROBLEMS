class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i =0; i<(words.length-1);i++){
            for(int j =i+1; j<words.length; j++){
                if(isPrefixAndSuffix(words[i], words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2){
        if(str2.indexOf(str1)!=0){
            return false;
        }
        if(!str2.substring(str2.length()-str1.length()).equals(str1)){
            return false;
        }
        return true;
    }
}
