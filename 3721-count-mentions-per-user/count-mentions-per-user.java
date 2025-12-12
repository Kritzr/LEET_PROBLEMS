class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        
        // Sorting the events array
        events.sort((a, b) -> {
            
            int ts1 = Integer.parseInt(a.get(1)); 
            int ts2 = Integer.parseInt(b.get(1));
            
            if (ts1 != ts2) {
                return Integer.compare(ts1, ts2);
            }
            if (a.get(0).equals("OFFLINE") && b.get(0).equals("MESSAGE")) {
                return -1; 
            }

            if (a.get(0).equals("MESSAGE") && b.get(0).equals("OFFLINE")) {
                return 1; 
            }
            return 0;
        });

        int ans[] = new int[numberOfUsers]; 
        // map stores the user ID -> OFFLINE EXPIRY TIMESTAMP (start time + 60).
        // If a user  not in the map, they are ONLINE.
        Map<Integer, Integer> Map = new HashMap<>(); 
        
        for(int i = 0; i < events.size(); i++){ 
            List<String> ed = events.get(i);
            String et = ed.get(0);
            int current = Integer.parseInt(ed.get(1));

            for (int k = 0; k < numberOfUsers; k++) {
                if (Map.containsKey(k)) {
                    
                    if (current >= Map.get(k)) {
                        Map.remove(k); 
                    }
                }
            }
            
            
            if(et.equals("MESSAGE")){
                String str = ed.get(2);
                
                if(str.equals("ALL")){
                    
                    for(int j = 0; j < numberOfUsers; j++){ 
                        ans[j]++;
                    }
                }
                else if(str.equals("HERE")){ 
                    
                    for(int k=0; k < numberOfUsers; k++){
                        
                        if(!Map.containsKey(k)){ 
                            ans[k]++; 
                        }
                    }
                }
                else {
                    
                    String[] pts = str.split(" ");
                    for(String part : pts){
                        try {
                           
                            int user = Integer.valueOf(part.substring(2)); 
                            if (user >= 0 && user < numberOfUsers) {
                                ans[user]++;
                            }
                        } catch (Exception e) {
                            // Ignore malformed tokens
                        }
                    }
                }
            }
            
           
            else if(et.equals("OFFLINE")){ 
                int id = Integer.valueOf(ed.get(2));
                Map.put(id, current + 60); 
            }
        }
        return ans;
    }
}