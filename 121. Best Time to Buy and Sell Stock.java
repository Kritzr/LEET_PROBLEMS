/*class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE; 
        int max = 0;
        int max_index;
        int min_index;
        for(int i:prices){
            if(i<min){
                min = i;
            }
            int profit = i- min;

            if(profit>max){
                max = profit;
            }

        }
        return max;
    }
}*/

//dp
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for(int i:prices){
            max = Math.max(max, i-min);
            min = Math.min(i, min);
        }
        return max;
    }
}
