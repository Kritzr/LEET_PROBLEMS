class Solution {
    private int MOD = 1000000007;
    //combinatorics method 
    public int numberOfWays(String corridor) {
        List<Integer> noseats = new ArrayList<>();
        for(int i=0; i<corridor.length(); i++){
            if(corridor.charAt(i)=='S'){
                noseats.add(i);
            }

        }
        int length = noseats.size();
        if(length<2 || length%2!=0){
            return 0;
        }

        long ans =1; 
        for(int i=1; i<length-1; i+=2){
            ans = (ans*(noseats.get(i+1)-noseats.get(i)))%MOD;

        }
        return (int) ans;
    }
        
    
}