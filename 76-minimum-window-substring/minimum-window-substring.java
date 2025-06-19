class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()){
            return "";

        }

        Map<Character,Integer> countofT = new HashMap<>();
        Map<Character,Integer> windowofS = new HashMap<>();
        for(char c: t.toCharArray()){
            countofT.put(c, countofT.getOrDefault(c,0)+1);
        }

        int have =0, need = countofT.size();
        int[] result = {-1,1};
        int resultLength = Integer.MAX_VALUE;
        int left = 0;

        for(int right = 0; right<s.length(); right++){
            char c =s.charAt(right);
            windowofS.put(c, windowofS.getOrDefault(c,0)+1);

            if(countofT.containsKey(c) && windowofS.get(c).equals(countofT.get(c))){
                have++;
            }

            while(have == need){
                if((right-left+1) < resultLength){
                    resultLength = right-left+1;
                    result[0] = left;
                    result[1] = right;
                }

                char leftCharacter = s.charAt(left);
                windowofS.put(leftCharacter, windowofS.get(leftCharacter) -1);
                if(countofT.containsKey(leftCharacter) && windowofS.get(leftCharacter) < countofT.get(leftCharacter)){
                    have -- ;
                }
                left++;
            }
        }
        return resultLength == Integer.MAX_VALUE? "" : s.substring(result[0], result[1]+1);

    }
}