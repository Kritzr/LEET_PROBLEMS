class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum_gas =0;
        int sum_cost = 0;
        for(int i : gas){
            sum_gas+=i;
        }
        for(int j : cost){
            sum_cost+=j;
        }

        if(sum_gas<sum_cost){
            return -1;
        }

        int total =0;
        int res=0;
        int start =0;
        for(int i =0; i<gas.length;i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total =0;
                start = i+1;
            }
        }
        return start ;

    }
}