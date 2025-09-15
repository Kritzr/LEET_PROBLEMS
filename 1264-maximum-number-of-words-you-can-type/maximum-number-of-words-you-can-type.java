class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenkeys = new HashSet<>();
        for(char c: brokenLetters.toCharArray()){
            brokenkeys.add(c);
        }
        String[] words = text.split(" ");
        int count = 0;
        for(String word: words){
            boolean cantype = true; 
            for(char c:word.toCharArray()){
                if(brokenkeys.contains(c)){
                    cantype = false;
                    break;
                }
            }
            if(cantype){
                count++;
            }

        }
        /*
        for(int i =0; i<words.length;i++){
            String letter = words[i];
            int occurance = 0;
            for(int j=0; j<brokenLetters.length(); j++){
                for(int k =0; k<letter.length();k++){
                    if(letter.charAt(k)==brokenLetters.charAt(j)){
                        occurance++;
                    }
                }
                if(occurance!=0){
                    count--;
                }
            }
        }

        */
        return count;
    }
}