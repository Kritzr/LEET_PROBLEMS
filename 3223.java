class Solution {
    public int minimumLength(String s) {
        int length = 0;
        int[] frequency = new int[26];
        for(char c:s.toCharArray()){
            frequency[c-'a']++;
        }
        for(int count: frequency){
            if(count%2==1){
                length+=1;
            }
            else{
                length += Math.min(2,count);
            }
        }
        return length;
    }
}
