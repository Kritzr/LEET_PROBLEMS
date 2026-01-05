class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        int count =0; 
        long total=0; 
        int min_element= INT_MAX;
        int n = matrix.size();
        int m = matrix[0].size();
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                int value = matrix[i][j];
                if(value<0){
                    count++;
                }
                total+=std::abs(value);
                min_element=std::min(min_element, std::abs(value));

            }
            
        }
        if(count%2!=0){
                total-=2*min_element;
        }
        return total;
    }
};