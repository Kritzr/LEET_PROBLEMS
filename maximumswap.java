/*class Solution {
    public int maximumSwap(int num) {
        int maxele;
        ArrayList<Integer> digits = new ArrayList<>();
        while(num>0){
            int digit = num % 10;  
            digits.add(digit); 
            num = num / 10; 
        }
        Collections.reverse(digits);
        maxele = Collections.max(digits);
        if(digits.get(0)!=maxele){
            int maxIndex = digits.indexOf(maxele);
            Collections.swap(digits, 0, maxIndex);
        }

        int resultNumber = 0;
        for (int digit : digits) {
            resultNumber = resultNumber * 10 + digit;
        } 
        
        return resultNumber;
    }
}*/

class Solution {
    public int maximumSwap(int num) {
        
        char[] digits = Integer.toString(num).toCharArray();

        
        HashMap<Integer, Integer> lastOccurrence = new HashMap<>();

        
        for (int i = 0; i < digits.length; i++) {
            lastOccurrence.put(digits[i] - '0', i); 
        }

        
        for (int i = 0; i < digits.length; i++) {
            
            for (int d = 9; d > digits[i] - '0'; d--) {
                
                if (lastOccurrence.containsKey(d) && lastOccurrence.get(d) > i) {
                    
                    char temp = digits[i];
                    digits[i] = digits[lastOccurrence.get(d)];
                    digits[lastOccurrence.get(d)] = temp;

                    
                    return Integer.parseInt(new String(digits));
                }
            }
        }

       
        return num;
    }
}
