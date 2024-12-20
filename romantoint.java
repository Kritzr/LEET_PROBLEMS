class Solution {
    public int romanToInt(String s) {
        Map <Character,Integer> dictionary = new HashMap<Character,Integer>();
        int sum = 0;
        dictionary.put('I',1);
        dictionary.put('V',5);
        dictionary.put('X',10);
        dictionary.put('L',50);
        dictionary.put('C',100);
        dictionary.put('D',500);
        dictionary.put('M',1000);
        s = s.replace("IV","IIII");
        s = s.replace("XL","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        for(int i =0; i<s.length();i++){
            sum+=(dictionary.get(s.charAt(i)));
        }
        return sum;
    }
}
