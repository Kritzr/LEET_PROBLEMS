class Solution {
    public int lastRemaining(int n) {
        int head = 1, skip = 1, remain = n; 
        boolean left = true; 
        while(remain >1){
            if(left || remain%2==1){
                head+=skip;
            }
            remain/=2;
            skip*=2;
            left=!left;

        }
        return head;
    }

}