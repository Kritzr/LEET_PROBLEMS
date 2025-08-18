class Solution {
    public int compress(char[] chars) {
        int idx = 0; 
        int i =0 ; 
        while(i<chars.length){
            char current = chars[i];
            int count =0;

            while(i<chars.length && chars[i]==current){
                count++;
                i++;
            }

            chars[idx++]= current; 
            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[idx++] = c;
                }
            }

        }

        return idx;
    }
}