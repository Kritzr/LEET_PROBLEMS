class Solution {
    public int maxPower(String s) {
        int counter =1; 
        int max = 1;
        int i =0;
        for(int j=0; j<s.length(); j++){
             if(i==j){
                 continue;
             }
            if(s.charAt(i)==s.charAt(j)){
                counter++; 
                max = Math.max(counter, max);
            }
            else{
                counter =1; 
                i=j;
            }


        }
        return max;
    }
}