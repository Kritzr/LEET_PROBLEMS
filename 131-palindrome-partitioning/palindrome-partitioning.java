class Solution {
    public List<List<String>> partition(String s) {
        List<String> part = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        function(0,s,part,result);
        return result;
    }

    public void function(int idx, String s, List<String> part, List<List<String>> result){
        if(idx == s.length()){
            result.add(new ArrayList<>(part));
            return;
        }

        for(int i =idx; i<s.length(); i++){
            if(isPallindrome(s,idx,i)){
                part.add(s.substring(idx,i+1));
                function(i+1, s, part, result);
                part.remove(part.size()-1);
            }
        }
    }

    public boolean isPallindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}