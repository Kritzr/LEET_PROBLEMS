class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right;//setting it as the maximum value that she can devour

        while(left<=right){
            int k = (left+right)/2;
            long totaltime = 0;
            for(int p:piles){
                totaltime += Math.ceil((double)p/k);
            }

            if(totaltime <=h){
                result = k;
                right = k-1;
            }
            else{
                left = k+1;
            }

        }
        return result;
    }
}
