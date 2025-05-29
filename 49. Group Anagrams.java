class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        //char[] count= new char[26];
        for(String s:strs){
            char[] char_array = s.toCharArray();
            Arrays.sort(char_array);
            String sorted = newString(char_array);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(s)

        }
        return new ArrayList<>(res.values());
    }
}
