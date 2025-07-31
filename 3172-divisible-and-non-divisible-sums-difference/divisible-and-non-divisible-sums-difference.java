class Solution {
    public int differenceOfSums(int n, int m) {
        int sumofmultiples = 0; 
        int sumofnonmultiples = 0;
        for(int i =1; i<n+1;i++){
            if(i%m==0){
                sumofmultiples+=i;
            }
            else{
                sumofnonmultiples+=i;
            }
        }
        return (sumofnonmultiples-sumofmultiples);
    }
}