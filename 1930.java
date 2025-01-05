class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        Map<Character, int[]> firstlast = new HashMap<>();
        for(int i =0; i<n;i++){
            char c = s.charAt(i);
            if(!firstlast.containsKey(c)){
                firstlast.put(c, new int[]{i,i});
            }
            else{
                firstlast.get(c)[1]=i;
            }
        }

        int count = 0;
        for(Map.Entry<Character,int[]> entry :firstlast.entrySet()){
            int[] range = entry.getValue();
            if(range[0] == range[1]){
                continue;
            }
            Set<Character> unique = new HashSet<>();
            for(int i = range[0]+1;i<range[1];i++){
                unique.add(s.charAt(i));
            }
            count+= unique.size();
        }
        return count;
    }
}
