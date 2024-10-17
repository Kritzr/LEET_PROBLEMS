class Solution {
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
}
