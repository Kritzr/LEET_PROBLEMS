class Solution {
    public int mySqrt(int x) {
       int r = x;
        int l = 1; 
        while(l<=r){
            int m = l+(r-l)/2;
            long m_s = (long)m*m;
            if(m_s ==x)
                return m;
            
            else if(m_s <x)
                l = m+1;
            
            else
                r = m-1;
        }

        return r;

    }
}