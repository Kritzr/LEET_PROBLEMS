class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs[0].length(); //all of the strings are in the same length
        int count = 0 ;
        for(int i = 0; i<n; i++){
            for(int j = 1; j<strs.length; j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}