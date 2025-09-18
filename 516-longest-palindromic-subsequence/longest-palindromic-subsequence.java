class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String s2 = new StringBuilder(s).reverse().toString();

        int[] prev = new int[n+1];
        int[] current = new int[n+1];

        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1)==s2.charAt(j-1)){
                    current[j] = 1+ prev[j-1];
                }
                else{
                    current[j]= Math.max(prev[j], current[j-1]);
                }
            }

            prev= current.clone();

        }
        return prev[n];
    }
}