class TrieNode {
    public List<TrieNode> children;
    public int count; 
    public boolean isleaf;

    public TrieNode() {
        children = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            children.add(null);
        }
        count = 0;
        isleaf = false;
    }
}

class Solution {
    private TrieNode root;

    public Solution() {
        root = new TrieNode();
    }

    private void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (current.children.get(idx) == null) {
                current.children.set(idx, new TrieNode());
                current.count++;
            }
            current = current.children.get(idx);
        }
        current.isleaf = true;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        
        for (String str : strs) {
            if (str.isEmpty()) {
                return "";
            }
        }

        
        for (String str : strs) {
            insert(str);
        }

        
        StringBuilder lcp = new StringBuilder();
        TrieNode current = root;

        
        while (current != null && current.count == 1 && !current.isleaf) {
            for (int i = 0; i < 26; i++) {
                if (current.children.get(i) != null) {
                    lcp.append((char) ('a' + i));
                    current = current.children.get(i);
                    break; 
                }
            }
        }
        return lcp.toString();
    }
}