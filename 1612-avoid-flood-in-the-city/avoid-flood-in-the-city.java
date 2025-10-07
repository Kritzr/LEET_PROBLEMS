class Solution {
    public int[] avoidFlood(int[] rains) {
        // Map to store the last day a lake (key) became full (value)
        Map<Integer, Integer> fullLakes = new HashMap<>();
        // TreeSet to store the indices of dry days, allowing efficient searching for the next available dry day
        TreeSet<Integer> no_rain_days = new TreeSet<>(); 

        int n = rains.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) { 
                no_rain_days.add(i);
                ans[i] = 1; 
            } else { 
                if (fullLakes.containsKey(rains[i])) { 
                    
                    Integer dryDayIndex = no_rain_days.ceiling(fullLakes.get(rains[i]));
                    if (dryDayIndex == null) {
                        return new int[0]; 
                    }
                    ans[dryDayIndex] = rains[i]; 
                    no_rain_days.remove(dryDayIndex); 
                    fullLakes.remove(rains[i]); 
                }
                fullLakes.put(rains[i], i); 
                ans[i] = -1; 
            }
        }
        return ans;
    }
}