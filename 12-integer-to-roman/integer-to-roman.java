class Solution {
    public String intToRoman(int num) {
        int[] sys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] vals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
       // symList = [["I", 1], ["IV", 4], ["V", 5], ["IX", 9], ["X", 10], ["XL", 40], ["L", 50], ["XC", 90], ["C", 100], ["CD", 400],["D", 500],["CM", 900],["M", 1000]];

        StringBuilder result = new StringBuilder();
        for(int i =0; i<sys.length;i++){
            while(num >= sys[i]){
                num-= sys[i];
            
                result.append(vals[i]);
            }
        }
        return result.toString();

    }
}