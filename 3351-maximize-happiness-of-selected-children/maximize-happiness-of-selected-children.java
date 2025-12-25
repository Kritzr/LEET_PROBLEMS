class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length; 

        Arrays.sort(happiness);
        int no_turns=0;
        long total_happy = 0;
        for(int i=0; i<k; i++){
            int current_happy = happiness[n-1-i];
            int decresed_happy = Math.max(current_happy-i, 0);
            total_happy+=decresed_happy;
           // no_turns++;
        }
        return total_happy;
    }
}