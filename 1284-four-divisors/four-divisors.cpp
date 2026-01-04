class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        int totalSum = 0;
        for (int n : nums) {
            int count = 0;
            int currentSum = 0;
            
            for (int j = 1; j * j <= n; ++j) {
                if (n % j == 0) {
                    if (j * j == n) {
                       count++;
                        currentSum += j;
                    } else {
                        
                        count += 2;
                        currentSum += j + (n / j);
                    }
                }
                
                if (count > 4) break; 
            }
            if (count == 4) {
                totalSum += currentSum;
            }
        }
        return totalSum;
    }
};
