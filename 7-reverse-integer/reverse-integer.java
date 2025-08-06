class Solution{
    public int reverse(int x){
        int sign=0; 
        if(x<0){
            sign = -1;
            x = -x;
        }
        else{
            sign = 1; 

        }

        int result = 0; 
        int n =x ;
        while(n!=0){
            int rem  =n%10;
            if(result > (Integer.MAX_VALUE-rem)/10){
                return 0; 
            }

            result = (result*10)+rem;
            n/=10;
        }
        return result*sign;
    }
}