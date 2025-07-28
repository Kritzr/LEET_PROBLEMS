class Solution {
    public String nearestPalindromic(String n) {
        long number = Long.parseLong(n);
        long close = -1; //to store that closests
        for(long heman :getPallindrome(n)){
            if(close ==-1 || Math.abs(close-number) > Math.abs(heman - number)|| Math.abs(close-number) == Math.abs(heman - number) && heman < close )
            close = heman;
        }

        return Long.toString(close);

    }

    public Set<Long> getPallindrome(String n){
        int length = n.length();
        Set<Long> pallis = new HashSet<>();

        pallis.add((long)Math.pow(10, length-1)-1); //for one less digit
        pallis.add((long)Math.pow(10,length)+1); //for 10001 that is adding one 0 and then 1
        long first = Long.parseLong(n.substring(0, (length+1)/2));
        
        for (long i = first - 1; i <= first + 1; ++i) {
            StringBuilder pallistring = new StringBuilder();
            pallistring.append(i); 
            pallistring.append(new StringBuilder(Long.toString(i)).reverse().substring(length % 2));
            pallis.add(Long.parseLong(pallistring.toString()));
        }
        pallis.remove(Long.parseLong(n));
        return pallis;

    }
}